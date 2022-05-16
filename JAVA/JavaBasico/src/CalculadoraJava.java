import java.util.Scanner;

public class CalculadoraJava {
	public static void main(String[] args) {
	 
	Scanner numero1 = new Scanner(System.in);
	int opcion = 0;
	
	int n1;
	int n2;
	int r;
	
	System.out.println("Introduce el numero de la operacion a realizar");
	
	System.out.println("1) Suma");
    System.out.println("2) Resta");
    System.out.println("3) Multiplicacion");
    System.out.println("3) Division");
    
    Scanner menu = new Scanner(System.in);
   opcion=menu.nextInt();
    
   
    
    switch(opcion) {
    case 1:
    	
    	System.out.println("Escribe el primer numero");
        n1 = numero1.nextInt();
        System.out.println("Escribe el segundo numero");
        n2 = numero1.nextInt();
        r=n1+n2;
    	System.out.println("El resultado es " + r);
    	break;
    	
    case 2:
    	
    	
    	System.out.println("Escribe el primer numero");
        n1 = numero1.nextInt();
        System.out.println("Escribe el segundo numero");
        n2 = numero1.nextInt();
        r=n1-n2;
        System.out.println("El resultado es " + r);
        break;
    
    case 3:
    	
    	
    	System.out.println("Escribe el primer numero");
        n1 = numero1.nextInt();
        System.out.println("Escribe el segundo numero");
        n2 = numero1.nextInt();
        r=n1*n2;
        System.out.println("El resultado es " + r);
        break;
    case 4:
    	
    	
    	
    	System.out.println("Escribe el primer numero");
        n1 = numero1.nextInt();
        System.out.println("Escribe el segundo numero");
        n2 = numero1.nextInt();
        
        r=n1/n2;
        System.out.println("El resultado es " + r);
    	break;
    	
    	
    }  
  }
}









