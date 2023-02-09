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

