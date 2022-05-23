package com.pokemon;

public class TipoPlanta extends Pokemon{
	
	//atributos
	int numeroHojas;
	
	//contructor
	public TipoPlanta(int id, int edad, int nivel, String nombre, boolean evolucion, int numeroHojas) {
		super(id, edad, nivel, nombre, evolucion);
		this.numeroHojas = numeroHojas;
		
		
		
	}
	
	public int getNumeroHojas() {
		return numeroHojas;
	}

	public void setNumeroHojas(int numeroHojas) {
		this.numeroHojas = numeroHojas;
	}

	//metodos
	public void paralizar() {
		System.out.println("Paraliza");
	}
	
	public void envenenar() {
		System.out.println("Envenena");
	}

}
