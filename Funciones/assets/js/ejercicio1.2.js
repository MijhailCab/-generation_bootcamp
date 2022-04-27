//EJERCICIO 1.1
function palindromeChecker(str) {
    const texPalindromo = str.split("").reverse().join("");
  
    return texPalindromo === str ? "True" : "False";
  }
  console.log(palindromeChecker("ALA")); 

 //EJERCICIO 2
  function repeat(stringToRepeat, number) {
    let result = stringToRepeat.repeat(number);
    console.log(result);
  }
  
  repeat("Hola Mundo ", 3);
  
//EJERCICIO 4
  function factorial (numero) {
	var total = 1; 
	for (i=1; i<=numero; i++) {
		total = total * i; 
	}
	return total; 
}

console.log(factorial(5));

//EJERCICIO 1.2 CON PROMPT

function texto()
        {
            var palabra=prompt("Escribe una palabra").toLowerCase();
         
            
            palabra=palabra.replace(/ /g, "");
         
            for (var i=0;i<palabra.length;i++){
                if(palabra[i]!=palabra[palabra.length-i-1]){
                    return false;
                }
            }
            return true;
        }
         
        if(texto())
        {
            alert("TRUE");
        }else{
            alert("FALSE")
        }
       


//EJERCICIO 3
        let TextoBase = "hola mundo";
        let TextoCorto = TextoBase.substring(0, 4);
        console.log( TextoCorto );