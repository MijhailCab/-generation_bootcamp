import java.util.Scanner;

public class Ejercicio1 {
	/*Crear una aplicaci�n que reciba un int entre 1 y 10 y que regrese un mensaje seg�n la calificaci�n ingresada.


menos de 3 == "Failed!"
menos de 5 == "Insufficient!"
menor de 9 == "Good!"
10 == "Excellent!"

Mayor de 10 == "Grade outside range supported!"
*/
	public static void main(String[]args) {
		int calificacion = 5;
//		System.out.println("ingresa una calificaci�n "  );
//		Scanner calificacion = new Scanner (System.in);
//		calificacion = calificacion.nextInt();
		
		if (calificacion <= 3) {
			System.out.println("Failed!");
		}else if (calificacion > 3 && calificacion <= 5){
			System.out.println("Insufficient!");
		}else if (calificacion > 5 && calificacion<=9) {
			System.out.println("Good!");
		}else if (calificacion ==10){
			System.out.println("Excellent!");
		}else if (calificacion >10){
			System.out.println("Grade outside range supported");
		}
		
	
}
