let quiz2=require("../quiz2.js");

describe("objectSum", function () {
    it("empty", function () {
        expect(quiz2.objectSum([])).toBe(0);
    });
    it("single", function () {
        expect(quiz2.objectSum([2])).toBe(2);
    });
    it("multiple", function () {
        expect(quiz2.objectSum([1, 2, 3])).toBe(6);
    });
    it("non numbers", function () {
        expect(quiz2.objectSum([1, 2, "Jelly Fish", 3])).toBe(6);
    });
    it("recursive arrays", function () {
        expect(quiz2.objectSum([1, 2, [-6, 2, -2], 3])).toBe(6);
    });    
    it("negative", function () {
        expect(quiz2.objectSum([1, 2, -6, 3])).toBe(0);
    });      
});
