package testes;

import java.util.ArrayList;
import java.util.List;

import calculos.Calculo;
import junit.framework.TestCase;

public class CalculoTest extends TestCase {

	public void testExecutaCalculo() {
		int valor1 = 10;
		int valor2 = 20;
		
		int retornoEsperado = 30;		
		int retornoFeito = Calculo.executaCalculo(valor1, valor2);
		
		assertEquals(retornoEsperado, retornoFeito);
	}
	
	public void testCalculaDelta() {
		Long a = 1L;
		Long b = -4L;
		Long c = -45L;
		
		Long retornoEsperado = 196L;
		Long retornoReal = Calculo.calculaDelta(a, b, c);
		
		assertEquals(retornoEsperado, retornoReal);
	}
	
	public void testCalculaRaizes() {
		Long a = 1L;
		Long b = -4L;
		Long c = -45L;
		Long delta = 196L;
		
		List<Long> retornoEsperado = new ArrayList<Long>();
		retornoEsperado.add(9L);
		retornoEsperado.add(-5L);
		
		List<Long> retornoReal = Calculo.calculaRaizes(a, b, c, delta);
		
		assertEquals(retornoEsperado, retornoReal);
	}
	
}