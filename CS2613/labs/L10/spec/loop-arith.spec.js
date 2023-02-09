let arith=require("../loop-arith.js");
let arith2=require("../rec-arith.js");

describe("add",
	 function() {
	     it("1 + 1 = 2",
		function() {
		    expect(arith.plus(1,1)).toBe(arith.plus(1,1));
		});
	     it("0 + 1 = x",
		function() {
		    expect(arith.plus(0,3)).toBe(arith.plus(0, 3));
		});
	 });

describe("mult",
	 function() {
	     it("0 * 2 = 0",
		function() {
		    expect(arith2.mult(0,2)).toBe(arith.mult(0,2));
		});
	     it("1 * 2 = 2",
		function() {
		    expect(arith2.mult(1,2)).toBe(arith.mult(1,2));
		});
	     it("2 * 2 = 4",
		function() {
		    expect(arith2.plus(2,2)).toBe(arith.plus(2,2));
		});
	 });
