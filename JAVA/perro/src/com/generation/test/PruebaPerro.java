package com.generation.test;

import com.generation.model.perro.Perro;

public class PruebaPerro {

	public static void main(String[] args) {
		//Crear el objeto de tipo perro
		Perro pelusa = new Perro("Pelusa","French","chico", 4,"Blanco");
		System.out.println(pelusa);
		pelusa.comer();
	
		//Nuevo perro
		Perro solovino = new Perro("Solovino", "mestizo","mediano", 5 , "cafe");
		System.out.println(solovino);


		
		pelusa.setHumano("Pedro");
		solovino.setHumano("Daniel");
		
		
	}
	

}
