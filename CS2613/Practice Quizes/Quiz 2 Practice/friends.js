class Friends {
	constructor() {
		for(let a of arguments) {
			if(this[a.person] != null) {
				this[a.person].push(a.hasFriend);
			}
			else {
				this[a.person] = [a.hasFriend];
			}
		}
		
	}	
	count(personName) {
		let count = 0;
		
		if(this[personName] != null) {
			return this[personName].length;
		}
		else {
			return 0;
		}
		
	}
}

module.exports.Friends = Friends;
