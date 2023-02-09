
class Candy{
	constructor(brand, grams){
		this.brand = brand;
		this.grams = grams;
	}
}
exports.Candy=Candy;

class Box{
	constructor(...args){
		this.candy=args;
	}
	total(brand){
		let totals=0;
		for(let i=0; i<this.candy.length; i++){
			let box = this.candy[i];
			if(box instanceof Candy){
				if(box.brand == brand){
					totals+=box.grams;
				}
			}
			else if(box instanceof Box){
				totals+=box.total(brand);
			}
		}
		return totals;
	}
}

exports.Box=Box;

let obj2= new Box(new Candy("Starbucks", 60));
console.log(obj2.total("Starbucks"));


class Friends{
	constructor(...friendships){
		for(let i=0; i<friendships.length; i++){
			if(this[friendships[i].person] == null){
				this[friendships[i].person]=[friendships[i]["hasFriend"]];
			}
			else{
				this[friendships[i].person].push(friendships[i].hasFriend);
			}
		}
	}
	count(persons){
		if(persons==null){
			return 0;
		}
		if(!(persons in this)){
			return 0;
		}
		return this[persons].length;
		
	}
}

exports.Friends=Friends;


//Quiz 2


function objectSum(obj){
	let sum=0;
	if(obj.length === undefined) obj=Object.values(obj);
	for(let i=0; i<obj.length; i++){
		if(typeof obj[i] === 'number') sum+=obj[i];
		if(typeof obj[i] === 'object') sum+=objectSum(obj[i]);
	}
	
	return sum;
}

exports.objectSum=objectSum;
