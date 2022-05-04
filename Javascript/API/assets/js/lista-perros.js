const url = "https://dog.ceo/api/breeds/list/all"
const lista = document.querySelector("ul")

fetch(url).then(resp => resp.json()).then(datos =>{
    console.log(datos.message.terrier); //Para verlos en general a la consola

    const arregloTiposTerrier = datos.message.terrier
    console.log(arregloTiposTerrier);

    arregloTiposTerrier.forEach(element => {
        console.log(tipoTerrier);
        const template = ` `

    });
})
