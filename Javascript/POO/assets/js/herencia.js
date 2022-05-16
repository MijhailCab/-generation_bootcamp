class Pokemon{
    //atributos
    #nombre = '';
    #edad = 0;
    #evolucion = '';
    #tipo = '';


    constructor(nombre,edad,evolucion,tipo){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion = evolucion;
        this.#tipo = tipo;
    }
    get getnombre(){
        return this.#nombre
    }
    
    atacar(){
        return console.log(`${this.#nombre}, está atacando`)
    }

    evolucionar(){
        let mensaje = ''
        
        if(this.#evolucion === ''){
            mensaje = 'No puedo evolucionar';
            console.log(mensaje) 
        }else{
            mensaje = `${this.#nombre} ha evolucionado a ${this.#evolucion}`;
            this.#nombre = this.#evolucion;
            console.log(mensaje);
        }

         
    }

}

// const charmander = new Pokemon('charmader', 2, '', 'Fuego' );
// const bulbasaur = new Pokemon('Bulbasaur', 1, 'Ivisaur', 'Planta');

// console.log(charmander);
// console.log(bulbasaur);

// charmander.atacar();
// bulbasaur.atacar();

// charmander.evolucionar();


//class hija
class TipoFuego extends Pokemon{
    //atributos
    #tipo = '';
    constructor(nombre, edad, evolucion){
        super(nombre, edad, evolucion);
        this.#tipo = 'Fuego';
    }
}

let nombre = 'charmander'

const charmander = new TipoFuego(nombre, 2, 'charmeleon');
console.log(charmander);

charmander.atacar(){
    return console.log(`${super.nombre}, está lanzando un ataque tipo fuego `);
}