import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
	        
	        int imc;
	        int peso;
			int talla; 
	     
	        System.out.println("Cual es su peso ");
	        peso= teclado.nextInt();
	        System.out.println("Cual es tu estatura");
	        talla= teclado.nextInt();
		
	        imc = peso/(talla*talla);
	        System.out.println("SU IMC ES: "+ imc);
	            
	        if (imc<18.5) {
	            System.out.println("BAJO PESO");
	        } else if (imc>=18.5 && imc<=24.9) {
	            System.out.println("NORMAL");
	        } else if (imc>=25 && imc<=29.9) {
	            System.out.println("SOBREPESO");
	        } else {
	            System.out.println("OBESIDAD");
	        }
}
}
