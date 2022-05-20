package com.perritos;

public class Perro {
	
	//Atributos o propiedades.
	String nombre;
	int edad;
	String raza;
	String tamanio;
	
	
	//Constructor
	public Perro(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	//Metodos, en lo que javascript son Funciones.
	
	public void ladrar() {
		System.out.println("El perro "+ nombre + " Hace Guauf");
	}
	
	public int edadPerruna() {
		return edad * 7;
	}

}
