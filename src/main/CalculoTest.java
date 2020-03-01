package main;

import junit.framework.TestCase;

public class CalculoTest extends TestCase {

	public void testExecutaCalculo() {
		int valor1 = 10;
		int valor2 = 20;
		
		int retornoEsperado = 30;		
		int retornoFeito = Calculo.executaCalculo(valor1, valor2);
		
		assertEquals(retornoEsperado, retornoFeito);
	}
	
}