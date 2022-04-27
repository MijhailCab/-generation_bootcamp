//<!-- funciones nos permiten reutilizar el codigo -->




function saludar(nombre = "panchito", apellido = ""){
    // let nombre = "Mijhail" ;
    //string normal
    //console.log(` hola mi nombre es:  ${nombre} `);// 
    //template strings !!plantillas literales
    //console.log("Hola mi nombre es: ", nombre);
    return "mi nombre es ${nombre} ${apellido}";

    
}




saludar("pedro", "perez");//la invocacion o llamada de la funcion

let funcionSaludar = saludar("Felipe","maqueda")
console.log(funcionSaludar);

console.log(saludar("alberto","hernandez"));








// document.write para agregar texto directamente en html, no olvidar agregar las etiquetas correspondientes de inicio y cierre  "<h1></h1>"


//  document.write(" <h1>Estes es un H1 </h1>");
//  console.log(" <h1>Estes es un H1 </h1>");
//  console.log(" <h1>Estes es un H1 </h1>");  //platillaliteral





//2 tipos basicos de funciones
//funcion declarada
function suma (a,b){
    return a+ b;

}

console.log(suma(10,20)); //retorna el resultado 30

//funciones expresadas funcion expresion

const rest = function(a,b){
    return a - b;

}

console.log(resta(30,10));


//  setTimeout(()={

// }, 3000)

.
//funcion flecha.
const multiplicacion = () =