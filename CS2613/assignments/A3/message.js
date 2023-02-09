/*Question 1*/
function match(mail, headers) {
	for (let header in headers) {
		if (mail.headers[header] != headers[header]) {
			return false;
		}
	}
	return true;
}

/*Question 2 - Part 1*/
function body(msg) {
	let i = 0;
	if (msg["body"][i]["content-type"] === "text/plain") {
		return msg["body"][i]["content"];
	}
	if (msg["body"][i]["content-type"] === "multipart/signed") {
		return msg["body"][i]["content"][i]["content"];
	}
}

/*Question 2 - Part 2*/
function string(msg) {
	let string = "";
	if (msg["headers"]["From"] !== undefined) {
		string = string.concat("From: ", msg["headers"]["From"], "\n");
	}
	if (msg["headers"]["Date"] !== undefined) {
		string = string.concat("Date: ", msg["headers"]["Date"], "\n");
	}
	if (msg["headers"]["Subject"] !== undefined) {
		string = string.concat("Subject: ", msg["headers"]["Subject"], "\n");
	}
	if (msg["headers"]["To"] !== undefined) {
		string = string.concat("To: ", msg["headers"]["To"], "\n");
	}
	if (msg["body"] !== undefined) {
		string = string.concat("\n", body(msg));
	}
	return string;
}

exports.match = match
exports.body = body;
exports.string = string;
