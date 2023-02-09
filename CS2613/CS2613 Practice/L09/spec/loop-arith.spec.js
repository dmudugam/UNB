    let arith=require ("../loop-arith.js");

    describe("add",
         function() {
            it("1 + 1 = 2",
                function() {
                    expect(arith.plus(1,1)).toBe(2);
                });
             it("0 + x = x",
                function() {
		expect(arith.plus(0,1)).toBe(1);
                });
        });

    describe("mult",
         function() {
             it("0 * 2 = 0",
		function() {
                    expect(arith.mult(0,2)).toBe(0);
                });
             it("1 * 2 = 2",
                function() {
                    expect(arith.mult(1,2)).toBe(2);
                });
             it("2 * 2 = 4",
               function() {
             	   expect(arith.mult(2,2)).toBe(4);
                });
   });

describe("minus",
         function() {
             it("5 - 2 = 3",
		function() {
                    expect(arith.minus(5,2)).toBe(3);
                });
             it("6 - 6 = 0",
                function() {
                    expect(arith.minus(6,6)).toBe(0);
                });
             it("6 - 5 = 1",
               function() {
             	   expect(arith.minus(6,5)).toBe(1);
                });
   });
