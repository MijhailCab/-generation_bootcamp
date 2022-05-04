const url = "https://api.jikan.moe/v4/seasons/now"

fetch(urlUltimos).then(resp.json()).then(datos  =>{
    console.log(datos.data);

    const arregloAnimesUltimos = datos.data
    console.log(arregloAnimesUltimos [0]);
})