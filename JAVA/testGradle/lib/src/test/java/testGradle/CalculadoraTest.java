package testGradle;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Test de la clase Calculadora")
public class CalculadoraTest {
	
	@Test
	@DisplayName("meotodo para comprobar suma")
	public void sumaTest() {
		Calculadora sumaCalc = new Calculadora();
		Assertions.assertEquals(6, sumaCalc.suma(1,2), "El resultado debería ser 6");
	}
	@DisplayName("meotodo para comprobar assertions ")
	@Test
	public void assertionTest(){
//		boolean valorBoolean = true;
//		assertTrue(valorBoolean);
		
		assertAll(
				"encabezado",
				() - > assertEquals(2, 1+1,"deberia ser 2"),
				() - > assertTrue(false,"Deberia ser true")
				);
		
	}

}
