package main;

import java.util.List;

import calculos.Calculo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Testando o JUnit.");
		
		Long a = 1L;
		Long b = -4L;
		Long c = -45L;
		Long delta = Calculo.calculaDelta(a, b, c);
		
		List<Long> retornoReal = Calculo.calculaRaizes(a, b, c, delta);
		for (Long r : retornoReal) {
			System.out.println("Raiz: " + r);
		}
	}

}
