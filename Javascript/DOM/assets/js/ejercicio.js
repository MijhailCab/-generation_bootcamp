const $card = document.querySelector('.card');
const $form = document.querySelector('.form');


$form.addEventListener('submit', (e) => {

    const datos = Object.fromEntries(
        new FormData(e.target)
    )


    crearElemento(datos.url, datos.texto);


});


console.log();

function crearElemento(url, texto) {
    const img = document.createElement('img');
    const txt = document.createElement('figcaption')

    img.src = url;
    img.alt = texto;

    txt.textContent = texto;


    //appendChild
    $card.appendChild(img);
    $card.appendChild(txt);


}

