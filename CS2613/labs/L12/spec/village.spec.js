let village=require("../village.js");
let VillageState=village.VillageState;

describe("roadGraph", function () {
    let roadGraph = village.roadGraph;
    it("Alice's House", ()=> expect(roadGraph["Alice's House"]).toEqual(["Bob's House", "Cabin", "Post Office"]));
    it("Bob's House", ()=> expect(roadGraph["Bob's House"]).toEqual(jasmine.objectContaining(["Alice's House"])));
    });
    
describe("VillageState", function () {
	let first = new VillageState("Post Office", [{place: "Post Office", address: "Alice's House"}, {place: "Mars", address: "Jupiter"}]
	);
	let next = first.move("Alice's House");
	it("next place", () => expect(next.place).toBe("Alice's House"));
	it("next parcels", () => expect(next.parcels).toEqual([{place: "Mars", address: "Jupiter"}]));
	it("invalid destination", () => expect(first.move("Mars")).toEqual(first));
	it("first place", () => expect(first.place).toEqual("Post Office"));
});

describe("runRobot",
         function() {
             it("no parcels",
                 function() {
                    console.log = jasmine.createSpy("log");
                    noParcels = new VillageState("Post Office",[]);
                    village.runRobot(noParcels);
                    expect(console.log).toHaveBeenCalledWith("Done in 0 turns");
                    });
                    it("random robot",
                 function() {
                    console.log = jasmine.createSpy("log");
                    let rando = new VillageState("Post Office",[]);
                    village.runRobot(VillageState.random(), village.randomRobot);
                    expect(console.log).toHaveBeenCalledWith(jasmine.stringMatching(/^Done/));
                })
                it("route robot",
                 function() {
                    console.log = jasmine.createSpy("log");
                    village.runRobot(village.VillageState.random(), village.routeRobot, []);
                    expect(console.log).toHaveBeenCalledWith(jasmine.stringMatching(/^Done/));
                })
                });


