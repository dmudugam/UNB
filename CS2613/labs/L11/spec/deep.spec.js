let deepEqual=require("../deepEqual.js").deepEqual;

describe("equal", function () {
    let obj = {here: {is: "an"}, object: 2};
    it("self", function () {
        expect(deepEqual(obj,obj)).toBe(true);
    });
    it("null", function () {
        expect(deepEqual(null,null)).toBe(true);
    });
    it("null2", function () {
        expect(deepEqual(null,"bob")).toBe(false);
    });

    it("different", function () {
        expect(deepEqual(obj, {here: 1, object: 2})).toBe(false);
    });
    it("different2", function () {
        expect(deepEqual(obj, {object: 2})).toBe(false);
    });
    it("equivalent", function () {
        expect(deepEqual(obj, {here: {is: "an"}, object: 2})).toBe(true);
    });
});
