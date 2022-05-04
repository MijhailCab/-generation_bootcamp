const url ="https://api.thecatapi.com/v1/images/search"
const imagen = document.getElementById("ImagenGatito")
const imagen2 = document.getElementById("ImagenGatito2")

getElementById(button)
fetch(url).then(respuesta => respuesta.json()).then(datos=> {
    console.log(datos.message);
    imagen.src = datos.message
})


async function obtenerPerrito(){
    const infoGatitos = await fetch(url)
    const Gatitos = await infoPerritos.json(url)
    console.log(infoPerritos);
}

obtenerPerrito()





