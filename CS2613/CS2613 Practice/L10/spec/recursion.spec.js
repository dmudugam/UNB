let arith=require ("../recursion.js");

describe("add",
	 function() {
	     it("1 + 1 = 2",
		function() {
		    expect(arith.plus(1,1)).toBe(2);
		});
	     it("0 + x = x",
		function() {
		    expect(arith.plus(0,3)).toBe(3);
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
		    expect(arith.plus(2,2)).toBe(4);
		});
	 });
