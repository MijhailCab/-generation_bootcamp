package com.calculadora;

import java.util.Scanner;

public class PruebaCalculadora {

	public static void main(String[] args) {
	System.out.println("Vamos a calcular");
	int a = 10;
	Scanner sc = new Scanner(System.in);
	
	Calculadora cal = new Calculadora();
	
	
	cal.sumarMensaje();
	
	String mensaje = cal.mensaje();
	System.out.println(mensaje);
	
	//Metodos con argumentos
	int suma = cal.sumar(10, 20);
	System.out.println(suma);
	
	
	
	//instanciar
	Areas calAreas = new Areas();
	
	calAreas.mensaje();
	int areaC = calAreas.areaCuadrado(5);
	System.out.println(areaC);
	
	double areaT = calAreas.areaTriangulo(5, 10);
	System.out.println(areaT);
	
	}

}
