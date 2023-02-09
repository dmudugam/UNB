let read_json_file=require("./read_json_file.js").read_json_file;

let data = null;

function by_name(name){
    if (data===null)
        data=read_json_file("ancestry.json");
        
    let b = null;
    
    for(let n of data) {
    	if(n.name === name) {
    		b = n;
    		
    		
    	}
    	
    }
	return b;
    

}
exports.by_name=by_name;
