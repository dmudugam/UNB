function range(from, to) {
	let array=[];
	for (let i=from; i<=to; i++) {
		array.push(i);
	}
	return array;
}

function sum(array) {
	let sum = 0;
	/*for(let i=0; i<array.length; i++) {
		sum += array[i];
	}
	return sum;
	*/
	
	/*for(let i of array) {
		sum += i;
	}
	return sum;
	*/
	
	array.forEach((a) => sum += a);
	return array.reduce((a,b)=> a+b,0);
}

function average (array) {
	//return array.reduce((a,b) => a+b, 0)/array.length;
	let sum = 0;
	for(let j of array) {
		sum += j;
	}
	return sum/array.length;
}
exports.range=range;
exports.sum=sum;
exports.average=average;
