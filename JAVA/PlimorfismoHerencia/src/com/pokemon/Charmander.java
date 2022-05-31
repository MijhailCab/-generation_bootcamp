package com.pokemon;

public class Charmander extends Pokemon implements TipoFuego, TipoVolador{

	
	
	
	public Charmander(int id, int edad, int nivel, String nombre, boolean evolucion) {
		super(id, edad, nivel, nombre, evolucion);
		
	}

	@Override
	public void lanzaLlamas() {
		System.out.println("LanzaLLamas");
	}

	@Override
	public void araniar() {
		System.out.println("Arañar");
		
		
	}

	@Override
	public void Volar() {
		System.out.println("Volar");
		
	
	}
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		
	}

	
	

}
