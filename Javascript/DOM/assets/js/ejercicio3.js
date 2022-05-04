const $button = document.getElementById('links');
$button.addEventListener('click', mostrarLinks);

function mostrarLinks() {
    const $links = document.querySelectorAll('a');
    
    $button.addEventListener('click', () => {
        console.log($links.length);
        console.log($links[0]);
        console.log($links[$links.length - 1]);
    })
}