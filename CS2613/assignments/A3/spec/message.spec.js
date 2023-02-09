let read_json_file = require("../read_json_file.js").read_json_file;
let message = require("../message.js");

let testMsg = {"headers": {"Subject" : "lunch", "Date" : "now"}};
let otherMsg = {"headers": {"Subject" : "dinner", "Date" : "now"}};

describe("match",
         function() {
             it("message matches itself",
                function () {
                    expect(message.match(testMsg,testMsg.headers)).toEqual(true);
                });
             it("message does not match if field changes",
                function () {
                    expect(message.match(testMsg,otherMsg.headers)).toEqual(false);
                });
             it("match subset of fields",
                function () {
                    expect(message.match(testMsg,{"Subject": "lunch"})).toEqual(true);
                });
});

describe("message body",
         function () {
             it("unsigned message",
                function () {
                    let message_objects=read_json_file("example1.json").flat(Infinity);
                    let msg = message_objects.filter((m) => message.match(m,{ "From": "Aron Griffis <agriffis@n01se.net>"}))[0];
                    expect(msg).not.toEqual(null);
                    expect(message.body(msg)).toEqual(`Just subscribed, I'd like to catch up on the previous postings,
but the archive link seems to be bogus?

Thanks,
Aron

`);
                });
             it("signed message",
                function () {
                    let message_objects=read_json_file("example2.json").flat(Infinity);
                    let msg = message_objects.filter((m) => message.match(m,{"From": "md@Linux.IT (Marco d'Itri)"}))[0];

                    expect(msg).not.toEqual(null);
                    expect(message.body(msg)).toEqual(`On Sep 09, Sean Whitton <spwhitton@spwhitton.name> wrote:

> 1. Is the 'should not' for the /etc/default practice too strong?  I
No, because it cannot be supported in a sane way by systemd units.
It should even be "must not".

-- 
ciao,
Marco
`);
                });
               
         });
         
let fullHeaderMsg ={"headers": {
    "Subject": "[notmuch] archive",
    "From": "Aron Griffis <agriffis@n01se.net>",
    "To": "notmuch <notmuch@notmuchmail.org>",
    "Date": "Tue, 17 Nov 2009 18:21:38 -0500"
}};

describe("toString",
    function () {
        it("works with no body",
            function () {
                expect(message.string(testMsg)).toEqual(`Date: now
Subject: lunch
`);
            });

        it("full set of headers",
            function() {
                expect(message.string(fullHeaderMsg)).toEqual(`From: Aron Griffis <agriffis@n01se.net>
Date: Tue, 17 Nov 2009 18:21:38 -0500
Subject: [notmuch] archive
To: notmuch <notmuch@notmuchmail.org>
`);
            });
    });

describe("toString real data",
    function () {
        it("unsigned message",
            function () {
                let message_objects=read_json_file("example1.json").flat(Infinity);
                let msg = message_objects.filter((m) => message.match(m,{ "From": "Aron Griffis <agriffis@n01se.net>"}))[0];
                expect(msg).not.toEqual(null);
                expect(message.string(msg)).toEqual(`From: Aron Griffis <agriffis@n01se.net>
Date: Tue, 17 Nov 2009 18:21:38 -0500
Subject: [notmuch] archive
To: notmuch <notmuch@notmuchmail.org>

Just subscribed, I'd like to catch up on the previous postings,
but the archive link seems to be bogus?

Thanks,
Aron

`);
            });
             
        it("signed message",
            function () {
                let message_objects=read_json_file("example2.json").flat(Infinity);
                let msg = message_objects.filter((m) => message.match(m,{"From": "md@Linux.IT (Marco d'Itri)"}))[0];

                expect(msg).not.toEqual(null);
                expect(message.string(msg)).toEqual(`From: md@Linux.IT (Marco d'Itri)
Date: Sun, 10 Sep 2017 09:48:44 +0200
Subject: Bug#601455: Steps towards a patch to document disabling a daemon upon installation
To: debian-policy@lists.debian.org

On Sep 09, Sean Whitton <spwhitton@spwhitton.name> wrote:

> 1. Is the 'should not' for the /etc/default practice too strong?  I
No, because it cannot be supported in a sane way by systemd units.
It should even be "must not".

-- 
ciao,
Marco
`);});
    });
