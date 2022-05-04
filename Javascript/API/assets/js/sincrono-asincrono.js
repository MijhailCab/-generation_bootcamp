// let tiempo = 3000

 /*setTimeout(()=>{
     datos = "Mijhail"
   console.log(datos);

  },tiempo)*/



// console.log(datos);

// console.log("Hola");


const datos = [ 
    {
        nombre: "Mijhail"
        edad: 24,
    },
    {
        nombre: "SAM"
        edad: 29,
    },
    {
        nombre: "Cabrera"
        edad: 34,
    }
];

function obtenerDatos(){
    return new Promise((resolve.reject) => {
        setTimeout(()=>{
            resolve(datos)
         },3000)
    })
    
}

// console.log(obtenerDatos)



/* obtenerDatos().then((datos)=>{
    console.log(datos);

}) */


async function obtenerDatosAsync(){
    const datosObtenidos = await obtenerDatos()
}


