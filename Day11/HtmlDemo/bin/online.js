<<<<<<< HEAD
/**
 * 
 */

i = 0     //var keyword is not required
questions = [
      '1. What is  Object Oriented Programming',
      '2. Who introduced Java',
      '3. How to unlock a car?',
      '4. Why did Ram killed Ravana?'
             
            ];


function show(){
	document.getElementById("question").innerHTML = questions[i];
}

function next(){
	i = i+1;
	if(i <4){
		show();
	}else{
		alert("Exam Over")
	}
}

=======
/**
 * 
 */

i = 0     //var keyword is not required
questions = [
      '1. What is  Object Oriented Programming',
      '2. Who introduced Java',
      '3. How to unlock a car?',
      '4. Why did Ram killed Ravana?'
             
            ];


function show(){
	document.getElementById("question").innerHTML = questions[i];
}

function next(){
	i = i+1;
	if(i <4){
		show();
	}else{
		alert("Exam Over")
	}
}

>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
