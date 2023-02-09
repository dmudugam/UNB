function deepEqual(a, b) {
	if(a === null && b === null) {
		return true;
	}
	if( a === null || b === null) {
		return false;
	}
	if(typeof(a) === 'object' && typeof(b) === 'object') {
		//both are objects, recursively check fields for equality;
		for(let prop in a) {
			if(!(prop in b)) {
				return false;
			}
		
			if(!deepEqual(a[prop], b[prop])) {
				return false;
			}
		}
		return true;
	}
	else {
		return (a===b);
	}
}

exports.deepEqual = deepEqual;
