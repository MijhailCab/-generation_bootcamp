
addEventListener("load", function(){
    this.alert("se ha terminado de cargar la pagina");
});



function saludar(){
    alert("Hola");
}


/* Manejador de eventos sematico */
const $botonSemantico = document.getElementById("evento-semantico");

$botonSemantico.onclick = saludar;

$botonSemantico.onclick = function (evento){
    
    //alert("hola desde un manejador sematico");
    console.log(evento.target);

}
