function brag(name,...args){
    console.log(name + " has");
    for (let i=0; i<args.length; i++) {
        console.log("\t"+args[i]);
    }
}
brag("cs2613", "fun assignments", "easy tests", "exciting labs");
