<<<<<<< HEAD
/**
 * 
 */

function show(){
	var arr = [3,'hello',function(){return "welcome"},
	{'city':'hyderabad','state':'TS'}];
	var res = ""
	res += "first element " + arr[0] + "<br/>";
	res += "second element " + arr[1] + "<br/>";
	res += "third element " + arr[2]() + "<br/>";
	res += "key value 1 " + arr[3].city + "<br/>";
	res += "key value 2 " + arr[3].state + "<br/>";
	
	document.getElementById("res").innerHTML = res;
=======
/**
 * 
 */

function show(){
	var arr = [3,'hello',function(){return "welcome"},
	{'city':'hyderabad','state':'TS'}];
	var res = ""
	res += "first element " + arr[0] + "<br/>";
	res += "second element " + arr[1] + "<br/>";
	res += "third element " + arr[2]() + "<br/>";
	res += "key value 1 " + arr[3].city + "<br/>";
	res += "key value 2 " + arr[3].state + "<br/>";
	
	document.getElementById("res").innerHTML = res;
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
}