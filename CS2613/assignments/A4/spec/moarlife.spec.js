let life=require ("../moarlife.js");

let plan= ["############################",
           "#####                 ######",
           "##   ***                **##",
           "#   *##**         **  O  *##",
           "#    ***     O    ##**    *#",
           "#       O         ##***    #",
           "#                 ##**     #",
           "#   O       #*             #",
           "#*          #**       O    #",
           "#***        ##**    O    **#",
           "##****     ###***       *###",
           "############################"];


describe("World",
         function () {
             let valley = new life.LifelikeWorld(plan,
                 {"#": life.Wall,
                  "O": life.PlantEater,
                  "*": life.Plant});
             it("roundtrip",
                function() {
                    let rows = valley.toString().split("\n");
                    // drop blank row
                    rows.pop();
                    expect(rows).toEqual(plan);
                });
         });
