const Date= document.querySelector('#Date');
const nombre = document.querySelector('#Nombre');


btnCalcular.addEventListener('click'), Mandar;

function calcularEdad() {
    const yearNacimiento = year.value;
    const edad = yearActual - yearNacimiento;
    console.log(edad);
}

year = prompt('¿En qué año naciste?')
console.log(`Tienes ${2022-year} años`);


var boton = document.getElementById('boton');
boton.addEventListener('click', () => {
  let year = document.getElementById('year').value;
  console.log(`Tienes ${2022-year} años`);
});