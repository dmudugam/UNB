function makemap (){
    let map={};
    if (arguments.length %2 != 0)
        return map;

    for (let i=0; i<arguments.length; i+=2) {
	map[arguments[i]] = arguments[i+1];
    }

    return map;

}
console.log(makemap("hello", "world", "number", 2));

function brag(name,...args){
    console.log(name + " has");
    for (let i=0; i<args.length; i++) {
        console.log("\t"+args[i]);
    }
}



console.log(brag("hello", "world", "number", 2));

function win(person,thing="a brick"){
    console.log(person + " won " + thing);
}

console.log(win("hello", "world", "number", 2));
