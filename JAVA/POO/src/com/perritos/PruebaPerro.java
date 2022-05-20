package com.perritos;

public class PruebaPerro {

	public static void main(String[] args) {
		
		
		//Instanciar //Poner el tipo de dato, en este caso, perro
		Perro perro1 = new Perro("Patitas", 3);
	
		//Cambiar sus atributos
		
		perro1.raza = "Husky";
		perro1.tamanio = "Mediano";
		
		//metodo
		perro1.ladrar();
		
		int edadP = perro1.edadPerruna();
		System.out.println(edadP);
		
		//metodo estatico
		
		perro1.mensaje();
		
		Perro.ladrar();
		
		
		//
		Perro perro2 = new Perro("Cookies",1);
		
		
		perro2.raza = "Dalmata";
		perro2.tamanio = "Grande";
		
		perro2.ladrar();
		
		
		

	}

}
