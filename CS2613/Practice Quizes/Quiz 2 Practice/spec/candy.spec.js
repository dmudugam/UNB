let Candy=require("../candy.js").Candy;
let Box=require("../box.js").Box;

describe("candy",
         function() {
             let treat = new Candy("M&M", 25);
             it("brand", () => expect(treat.brand).toBe("M&M"));
             it("grams", () => expect(treat.grams).toBe(25));
         });
         
         
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
