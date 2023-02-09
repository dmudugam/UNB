 let arith=require ("../loop-arith.js");

    describe("add",
         function() {
            it("1 + 1 = 2",
                function() {
                    expect(arith.plus(1, 1)).toBe(2);
                });
             it("0 + x = x",
                function() {
			expect(arith.plus(0, 17)).toBe(17);
			expect(arith.plus(0, 43)).toBe(43);
                });
        });

    describe("mult",
         function() {
             it("0 * 2 = 0", () => expect(arith.mult(0, 2)).toBe(0));

             it("1 * 2 = 2",
                function() {
                    expect(arith.mult(1,2)).toBe(2);
                });
             it("2 * 2 = 4", () => expect(arith.mult(2, 2)).toBe(4));
         });
         
         describe("minus",
         function() {
             it("5 - 3 = 2", () => expect(arith.minus(3, 5)).toBe(2));

             it("5 - 5 = 0",
                function() {
                    expect(arith.minus(5,5)).toBe(0);
                });
         });
