function range(from, to) {
	let array = [];
	for(let i =from; i<=to; i++) {
		array.push(i);
	}
	return array;
}

function sum(array) {
	let sum = 0;
	for(let i of array) {
		sum += i;
	}
	return sum;
}

function average (array) {
	return array.reduce((a,b) =>  a + b, 0)/array.length;
}

function average2 (array) {
        let sum=0;
        array.forEach( (a) => sum+=a);
        return sum/array.length;
    }
    
console.log(average2([1,2,3]));
exports.range = range;
exports.sum = sum;
