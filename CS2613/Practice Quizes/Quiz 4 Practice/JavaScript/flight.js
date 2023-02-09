

class Flight{
	constructor(departure, arrival){
		this.departure=departure;
		this.arrival=arrival;
	}
	
	compare(flight){
		if(this.departure<flight.departure){
			return -1;
		}
		else if(this.departure>flight.departure){
			return 1;
		}
		else if(this.arrival<flight.arrival){
			return -1;
		}
		else if(this.arrival>flight.arrival){
			return 1;
		}
		else{
			return 0;
		}
	}
}

exports.Flight=Flight;
