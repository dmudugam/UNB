function plus(a,b) {
    for (var i=0; i < a; i++){
	b++;
    }
    return b;
}

function mult(a,b) {
    sum=0;
    for (var i=0; i<a; i++){
	sum = plus(sum,b)
    }
    return sum;
}

exports.plus = plus;
exports.mult = mult;
