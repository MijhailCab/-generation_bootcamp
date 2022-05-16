package com.calculadora;

public class Calculadora {

	//Metodo que no regresa nada - VOID
	public void sumarMensaje() {
		System.out.println("voy a sumar dos numeros");
		
	}
	//Metodo que retorna datos
	public String mensaje() {
		String mensaje = "voy a realizar una operacion";
		return mensaje;
		
	}
	public int prueba() {
		return 2;
		
	}
	//Operaciones
	public int sumar(int a,int b) {
		return a+b;
	}
	public int restar(int a,int b) {
		return a-b;
	}
	public int multiplicar(int a,int b) {
		return a*b;
	}
	public int dividir(int a,int b) {
		return a/b;
	}
	public int elResto(int a,int b) {
		return a%b;
	}
	
	public int adicion(int a,int b) {
		return a++;
	}
	public int disminucion(int a,int b) {
		return --a;
	}
}




