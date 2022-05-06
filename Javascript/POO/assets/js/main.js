class persona{
    //atributos
    #nombre= '';
    #edad= 0;
    #correo='';
    #id= 0;
    static #contador = 0;



    constructor(nombre, edad, correo){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#correo = correo;
        this.#id = ++persona.#contador;

    }

    //Metodos Setters & getters
    //set & get
    //Fijar & Obetener 
    get getNombre(){
        return this.#nombre;
    }

    set setNombre(nombre){
        this.#nombre = nombre;
    }

    cambiarNombre(nombre){
        this.#nombre = nombre;
    }

    get getEdad(){
        return this.#edad;
    }

    set setedad(edad){
        this.#edad = edad;
    }

    cambiarEdad(edad){
        this.#edad = edad;
    }

    get getCorreo(){
        return this.#correo;
    }

    set setNombre(correo){
        this.#correo = correo;
    }
    //métodos

    cambiarCorreo(correo){
        this.#correo = correo;
    }

    saludar(){
        let mensaje = `Hola mi nombre es ${this.getNombre}`;
        return mensaje;
     }

     mostrarSaludo(){
         return persona.mensaje
     }

     mostrarContador(){
        return persona.#contador
    }


}



// instancia de la clase persona

const persona1 = new persona('Pedro', 30, 'pedritomix@gmail.com');
const persona2 = new persona('Gabriel', 27, 'gabrieltin@gmail.com');
const persona3 = new persona('carlitos',22 , 'nino@gmail.com')

//Setters

persona1.setNombre = 'jose'

// persona1.cambiarNombre('Antonio')


console.log(persona1);
console.log(persona2);

console.log(persona1.mostrarSaludo());
console.log(persona2.mostrarSaludo());

console.log(persona1.mostrarContador());
