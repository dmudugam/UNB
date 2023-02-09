function plus(a,b) {
    for (let i=0; i < a; i++){
        b++;
    }
    return b;
}

function mult(a,b) {
    sum=0;
    for(let i = 0; i<a; i++) {
    	sum = plus(sum,b);
    }


    return sum;
}

function minus(a,b) {
    for (let i=0; i < b; i++){
        a--;
    }
    return a;
}

exports.plus = plus;
exports.mult = mult;
exports.minus = minus;
