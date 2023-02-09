let village=require("../village.js");
let VillageState=village.VillageState;

describe("roadGraph", function () {
    let roadGraph = village.roadGraph;
    it("Alice's House", ()=> expect(roadGraph["Alice's House"]).toEqual(["Bob's House", "Cabin", "Post Office"]));
    it("Bob's House", ()=> expect(roadGraph["Bob's House"]).toEqual(jasmine.objectContaining(["Alice's House"])));
    });
    
describe("VillageState", function () {
	let first = new VillageState("Post Office", [{place: "Post Office", address: "Alice's House"}]
	);
	let next = first.move("Alice's House");
	it("next place", () => expect(next.place).toBe("Alice's House"));
	it("next parcels", () => expect(next.parcels).toEqual([]));
	it("first place", () => expect(first.place).toEqual("Post Office"));
});

