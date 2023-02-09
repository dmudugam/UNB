let Friends=require("../friends.js").Friends;

describe("friends",
    function (){
        let friends=new Friends({"person": "Alice", "hasFriend": "Santa"},
                                {"person": "Mallory", "hasFriend": "Bob"},
                                {"person": "Alice", "hasFriend": "Mallory"});
        let alice_friends = friends["Alice"];
        alice_friends.sort();

        it("not null", () => expect(friends).not.toEqual(null));
        it("property non-existent",
           () => expect(friends["Gollum"]).toEqual(undefined));
        it("property value",
           () => expect(alice_friends).toEqual(["Mallory","Santa"]));
        it("friend count, non-existent",
           () => expect(friends.count("Gollum")).toBe(0));
        it("friend count, 1",
           () => expect(friends.count("Mallory")).toBe(1));
        it("friend count, 2",
           () => expect(friends.count("Alice")).toBe(2));
    });
