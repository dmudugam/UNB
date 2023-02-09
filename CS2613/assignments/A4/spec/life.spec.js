let life=require ("../life.js");
let plan = ["############################",
            "#      #    #      o      ##",
            "#                          #",
            "#          #####           #",
            "##         #   #    ##     #",
            "###           ##     #     #",
            "#           ###      #     #",
            "#   ####                   #",
            "#   ##       o             #",
            "# o  #         o       ### #",
            "#    #                     #",
            "############################"];

let Vector = life.Vector;

describe("Grid",
    function() {
        it("initially undefined",
            function() {
                let grid = new life.Grid(5, 5);
                expect(grid.get(new life.Vector(1, 1))).toBe(undefined);
            });
        it("setting a value",
            function() {
                let grid = new life.Grid(5, 5);
                grid.set(new Vector(1, 1), "X");
                expect(grid.get(new Vector(1, 1))).toEqual("X");
            });
        it("forEach",
           function() {
               let grid = new life.Grid(5, 5);
               let test = {grid: grid,  sum: 0,
                           method: function () {
                               this.grid.forEach(function() { this.sum++; }, this);
                           }
                          };

               test.grid.set(new Vector(2,3), "#");
               test.grid.set(new Vector(3,4), "#");
               test.method();
               expect(test.sum).toBe(2);
           });
    });

describe("BouncingCritter",
         function() {
             let bob = null;
             beforeEach(function () {
                 spyOn(Math, 'random').and.returnValue(0.5);
                 bob=new life.BouncingCritter();
             });
             it("constructor",
                function() {
                    expect('direction' in bob).toBe(true);
                    expect(bob.direction).toBe('s');
                });
             it("act, clear path",
                function () {
                    let clear = {look: function () {return " ";}};
                    expect(bob.act(clear)).toEqual({type: "move", direction: "s"});
                });
             it("act, unclear path",
                function () {
                    let unclear = {look: function () {return "#";}, find: function () { return "n";}};
                    expect(bob.act(unclear)).toEqual({type: "move", direction: "n"});
                });
         });

describe("World",
         function () {
             it("roundtrip",
                function() {
                    let world = new life.World(plan, {"#": life.Wall, "o": life.BouncingCritter});
                    let rows = world.toString().split("\n");
                    // drop blank row
                    rows.pop();
                    expect(rows).toEqual(plan);
                });
             it("turn",
                function () {
                    let world = new life.World(plan, {"#": life.Wall, "o": life.BouncingCritter});
                    let count=0;
                    spyOn(world, 'letAct').and.callFake(function(critter,vector) {count++;});
                    world.turn();
                    expect(count).toBe(4);
                });
             it("checkDestination",
                function () {
                    let world = new life.World(plan, {"#": life.Wall, "o": life.BouncingCritter});
                    expect(world.checkDestination({direction: 's'},
                                                  new life.Vector(19,1))).toEqual(new life.Vector(19,2));
                    expect(world.checkDestination({direction: 'n'},
                                                  new life.Vector(0,0))).toEqual(undefined);
                });
             it("letAct",
                function () {
                    let world = new life.World(plan, {"#": life.Wall, "o": life.BouncingCritter});
                    let src=new life.Vector(19,1);
                    let dest=new life.Vector(19,2);
                    let bob=world.grid.get(src);
                    spyOn(bob,'act').and.returnValue({type: 'move', direction: 's'});
                    world.letAct(bob, src);
                    expect(world.grid.get(dest)).toEqual(bob);
                });
         });

describe("View",
         function () {
             let world = new life.World(plan, {"#": life.Wall, "o": life.BouncingCritter});
             let View=life.View;
             let position=new Vector(15,9);
             it("constructor",
                function () {
                    let view=new View(world, position);
                    expect(view.vector).toEqual(position);
                });
             it("look",
                function () {
                    let view=new View(world, position);
                    expect(view.look("s")).toBe(" ");
                });
             it("findAll",
                function () {
                    let view=new View(world, position);
                    let directionNames = [ 'e', 'n', 'ne', 'nw', 's', 'se', 'sw', 'w' ];
                    expect(view.findAll(" ").sort()).toEqual(directionNames);
                });
             it("find",
                function () {
                    let view=new View(world, position);
                    spyOn(Math, 'random').and.returnValue(0.5);
                    expect(view.find(" ")).toBe('s');
                });

         });
