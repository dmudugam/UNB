
//time

function timePlus(time1, time2){

	let mins=(time1.mins + time2.mins)%60;
	let hours= time1.hours + time2.hours + Math.floor((time1.mins+time2.mins)/60);
	
	return {'hours': hours, 'mins':mins};
}

//console.log(timePlus({mins:2, hours:30}, {hours:3, mins:20}));


function maketime(hours, mins){
    let plus=function (other) {
        let raw=timePlus(this,other);
        return maketime(raw.hours, raw.mins) // call from the constructor
    };

    return { 'hours': hours, 'mins': mins, 'plus': plus};
}

let A=maketime(10, 30);
let B=maketime(17, 47);
let C=A.plus(B);
//console.log(C);

//Prototypes

let prototime={
	plus: function(other){
		let raw = timePlus(this, other);
		return timeNew(raw.hours, raw.mins);
	}
	};
	
function timeNew(hours, mins){
	let obj = Object.create(prototime);  //plus inherited from the prototype
	obj.hours=hours;
	obj.mins=mins;
	
	return obj;
}

D=timeNew(21, 42);
E=timeNew(17, 37);

F=D.plus(E);
//console.log(F);

//classes

class Time2{
	constructor(hours, mins){
		this.hours=hours;
		this.mins=mins;
	};
	plus(other){
		let raw = timePlus(this, other);
		return new Time2(raw.hours, raw.mins);
	}
}



J=new Time2(21, 42);
K=new Time2(17, 37);

S=J.plus(K);
//console.log(S);

//range function
function range(min, max){
	let x=[];
	for(i=min; i<=max; i++){
		x.push(i);
		
	}
	return x;

}


exports.range=range;
//console.log(range(1, 10));

//sum
function sum(arr){
	let sum=0;
	for(i=0; i<arr.length; i++){
		sum+= arr[i];
	}
	return sum;
}
exports.sum=sum;
//console.log(sum(range(1,10)));

//average

function average(array){
	let sum=0;
	if(array.length===0){
		return 0;
	}
	else{
		for(let j of array){
			sum+=j;
			
		}
		return sum/array.length;
	}
	
}

/**function average(array){
	return array.reduce((a,b)=> a+b,  0)/array.length;
}*/

//console.log(average([1,2,3]));

//Using recursion

//plus

function plus(a, b){
	if(a==0){
	    return b;
	}
	else{
            return plus(a-1, b+1);
	}
}



function mult(a, b){
	if(a==0){
	     return 0;
	}
	else{
	     return plus(mult((a-1), b), b);
	}
}

//console.log(mult(3,2));

//deep comparison

//variadic function

function makemap(){
	let map={};
	if(arguments.length%2!=0){
		return map;
	}
	for(i=0; i<arguments.length; i+=2){
		map[arguments[i]]=arguments[i+1];
	}
	return map;
}

console.log(makemap("hello", "world", "number", 2));

//rest function

function brag(name, ...args){
	console.log(name + " has");
	for(i=0; i<args.length; i++){
		console.log("\t" + args[i]);
	}
}
brag("cs2613", "fun assignments", "easy tests", "exciting labs");

function win(person, things=" a brick "){
	console.log(person + " won" + things);
}
win("Bob");

