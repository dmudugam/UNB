let Candy=require("./candy.js").Candy;

class Box {
	boxes = new Array();
	constructor() {
		for(let a of arguments) {
			if(a instanceof Candy) {
				this.candy = a;
			}
			else {
				this.boxes.push(a);
			}
		}
	}
	
	total(brand) {
		let total = 0;
		if(this.candy != null && this.candy.brand === brand) {
			total += this.candy.grams;
		}
		for(let a of this.boxes) {
			total += a.total(brand);
		}
		return total;
	}
}

exports.Box = Box;
