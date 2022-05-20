package com.arreglos;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		
		//Arreglos-Matrices.
		//Solo pueden tener un tipo de dato
		//debemos
		/*
		 * numero - 0
		 * string - null
		 * booleanos - false
		 */
		
		
		int[] arrNumeros = new int[5];
		
		arrNumeros[0] = 1;
		arrNumeros[1] = Integer.parseInt("1");
		arrNumeros[2] = 1123;
		arrNumeros[3] = 11313;
		arrNumeros[4] = -123123;
		
				
//				System.out.println(Arrays.toString(arrNumeros));
//				System.out.println(arrNumeros[0]);	
//				System.out.println(arrNumeros[1]);	
//				System.out.println(arrNumeros[2]);
//				
				//Metodo para imprimir de manera más practica.
				
				for(int i=0; i<5; i++) {
					
					System.out.println(arrNumeros[i]);
					
				}
					//Podemos tambien ocupar un variante del for, que es el FOREACH
				//forEach
				int conteo = 0;
				for(int elemento : arrNumeros) {
					conteo++;
					System.out.println("Elemento " + conteo + "=" + elemento);
					
				}
				
				//Arreglo que guarda objetos.
				
				Persona persona1 = new Persona("Alex", 33);
				Persona persona2 = new Persona("Raul", 31);
				
				//Object arrPersona[] = new Object[3];
				Persona arrPersonas[] = new Persona[3];
				
				arrPersonas[0] = persona1;
				arrPersonas[1] = persona2;
				arrPersonas[2] = new Persona("Juan", 25);
				
				
				System.out.println(Arrays.toString(arrPersonas));
				
				
				for(Persona elemento : arrPersonas) {
					System.out.println(elemento.nombre + " - " + elemento.edad);
					
				}
				
	}

}

