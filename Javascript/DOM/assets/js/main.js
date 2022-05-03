/*Este es un nodo de comentario */

//cada uno de los nodos se entiende como un objeto en si, que llegan a tener propiedades y metodos.


const $titulo = document.querySelector("h1")
const $parr = document.querySelector("p")
const $card = document.querySelector(".card")
//nodeName
console.log($parr.nodeName);
console.log($titulo.nodeName);

//textContent

/*$parr.textContent = "Hola mundo"
console.log($parr.textContent);*/




//innerText - mejor no usarla.
//innerHTML

//$parr.innerHTML = "a href="#"> Este es un enlace </a>";


//Reemplaza lo que hay dentro del elemento seleccionado

//outerHTM

/*
$parr.outerHTML = "<z href="4">"Este es un enlace"</a>"
*/

//reemplaza todo, incluido el elemento que seleccionamos



//Crear elementos HTML

console.log();

function crearElemento() {
    const img = document.createElement("img")
    img.src ="https://www.purina-latam.com/sites/g/files/auxxlc391/files/styles/social_share_large/public/Que_debes_saber_antes_de_adoptar_un_gatito.jpg?itok=guFplHEU";

    //appendChild
    $card.appendChild(img);

}

crearElemento()
