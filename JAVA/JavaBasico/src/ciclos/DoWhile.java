package ciclos;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {
		
		String clave = "Pedro";
				
		String comparacion = "";
		
		
		do {
            comparacion = JOptionPane.showInputDialog("Introduce contraseņa, por favor");
			
			if(clave.equals(comparacion)) {
				System.out.println("La contraseņa es incorrecta");
		 }
		} while (clave.equals(comparacion)== false);		
		System.out.println("La contraseņa es correcta");
	}
}



