package com.generation.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	//Intertar el metodo main
	public static void main(String[] args) {
		
		//El primero de los arreglos, viene de la sub clase, LIST
		//se conoce como List - ArrayList
		//Estas colecciones llegan a heredar ciertas caracterizticas de las clases coleccion.
	    //Primero se escribe la clase principal de cual heredamos
		//Despues de usan los corchetes de mayor y menor que
		//Despues de le asigna el nombre a la variable en este caso "miArray"
	    //Dentro de los picoparentesis va el tipo de dato.
		
		
		        //Como podemos agregar elementos a nuestro Array List
				//Add nos permite insertar elmentos.
				//Primero agregando
		
		System.out.println("\tlist---ArrayList");
		
		
		List<String> miArray = new ArrayList<String>();
		
		
		miArray.add("Pedro");
		miArray.add("Yair");
		miArray.add("Maria");
		miArray.add("Maria");
		miArray.add("Maria");
		miArray.add("Maria");
		
		String elemento = miArray.remove(1);
		
		
		
		
		/*  
		 System.out.println(miArray);
		//Metodo para mostrar el tamaño del arreglo
		//size
		System.out.println(miArray.size());
		System.out.println(elemento); 
		*/
		
		imprimir(miArray);
		
		
		/*
		 * long ==> Long el daoto las basico
		 * double ===> Double 
		 * int ==> Interger nos permite usar metodos implementados en estas clases.
		 * boolean===> Boolean
		 * 
		 */
		int num1 = 10; //valor primitivo
		Integer num2 =10; //Java lo recibe como numero pero es un tipo de dato compuesto.
		
		System.out.println(num1);
		
		System.out.println(num2 instanceof Integer);
		
		
	    List<Integer>miArray2 = new ArrayList<Integer>();
	    
	    miArray2.add(1);
	    miArray2.add(2);
	    miArray2.add(3);
	    
		
		System.out.println(num2.getClass());
		//System.out.println(num1.getClass()); //int no tiene acceso a los metodos a los que si los tiene integer
		
		
		imprimir(miArray2);
		
		System.out.println("\t Set ---HashSet");
		Set<String> miSet = new HashSet<String>();
		//no acepta elementos duplicados
		//no los guarda en un orden específico
		//La coleccion que funciona más rápido
		
		miSet.add("Martha");
		miSet.add("Martha");
		miSet.add("Lupe");
		miSet.add("Buan");
		miSet.add("Cuan");
		miSet.add("Toño");
		miSet.add("alito");
		miSet.add("Yair");
		
		//Mi set los organiza como quiere, esto lo hace más rapido.
		
		System.out.println(miSet);
		System.out.println(miSet.size());
		
		imprimir(miSet);
		//el metodo contain nos retorna "verdadero" si el set contiene el elemento especificado.
		miSet.contains("Yair");
		
		System.out.println(miSet.contains("Yair"));
		//Con este metodo no se puede eliminar dirigido con indice, solo especifico.
		
		miSet.remove("Yair");
		miSet.remove("Toño");
		
		
		
		//Map-HashMap otro tipo de coleccion, tambien se le conoce como INDICE
	
		System.out.println("\t Map ---HashMap");
		//Creamos la variable.
		
		Map<String, Integer> miMap = new HashMap<String, Integer>();
		//el primer metodo que utilizaremos sera PUT
		
		//El metodo add no es reconocido en esta clase.
		//miMap.add();
		
		//En este caso se ocupa el metodo PUT
		//miMap.put(elemento, num2);
		//por lo tanto.
		
		
		miMap.put("Valor 1", 45);
		miMap.put("Valor 2", 50);
		//Metodo Values.
		//La coleccion esta contenida en el mapa, los datos en el mapa son reflejados en la coleccion y viceversa		
		//util para imprimir los valores
		
		System.out.println(miMap);
		System.out.println(miMap.values());//todos los valores
		System.out.println(miMap.keySet());//todas las llaves
		
		//si se quiere buscar una llave o un valor en especifico,
		
		System.out.println(miMap.get("Valor 1"));
		
		
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
			
		}
	}
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion ) {
			//System.out.println("Elemento = " + elemento);
			
		}
	}
}


