let Candy=require("../sample.js").Candy;
describe("candy",
         function() {
             let treat = new Candy("M&M", 25);
             it("brand", () => expect(treat.brand).toBe("M&M"));
             it("grams", () => expect(treat.grams).toBe(25));
         });

let Box=require("../sample.js").Box;
describe(
  "candy in boxes in boxes",
  function () {
    let inner = new Box (new Box (new Candy("Smarties", 500)),
                         new Box (new Box(new Candy("M&M", 100))),
                         new Candy("Smarties", 25));
    let box = new Box (new Box(new Candy("O Henry", 80)), inner);

    it("single match",
       () => expect(box.total("M&M")).toEqual(100));

    it("multi match",
       () => expect(box.total("Smarties")).toEqual(525));

        it("recursive non matching is 0",
       () => expect(box.total("Wasabi Peas")).toEqual(0));

  });

let Friends=require("../sample.js").Friends;

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

let objectSum = require("../sample.js").objectSum;

describe("objectSum", function () {
    it("base", function () {
        expect(objectSum([1,2,3])).toBe(6);
    });
    it("base with non-number", function () {
        expect(objectSum([1,2, "jellyfish",3])).toBe(6);
    });
    it("recursive arrays", function () {
        expect(objectSum([1,2, [-6,2,-2],3])).toBe(0);
    });
    it("just list", function () {
        expect(objectSum({a: 1, b: 2, c: 3})).toBe(6);
    });
    it("recursive arrays", function () {
        expect(objectSum([1,2, {thing: [-6, -12], other: 6}])).toBe(-9);
    });    
});
