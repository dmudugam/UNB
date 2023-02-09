let str="";
for (let i=0; i<60; i++) {
    console.log('\033c');
    str+= "*";
    console.log(str);
}

console.log("all done!");

function loop(i,str) {
    if (i>0) {
        console.log("\033c");
        console.log(str);
        setTimeout(function() { loop(i-1, str+"*"); }, 1000);
    }
}

loop(20,"*");

console.log("all done!");
