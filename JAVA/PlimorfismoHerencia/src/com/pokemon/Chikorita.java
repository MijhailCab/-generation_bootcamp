package com.pokemon;

public class Chikorita extends TipoPlanta{
	
	//atributos especificos.
	int numeroCuernitos;
	
	
	public Chikorita(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas) {
		super(id, edad, nivel,nombre, evolucion, numeroHojas);
		
		
		
	}
	
	//metodo especifico.
	public void latigazo() {
		System.out.println(getNombre() + " uso latigo");								
	}
	public void atacar() {
		System.out.println(nombre + " tipo planta esta atacando x2");
		
	}

}
