package calculos;

import java.util.ArrayList;
import java.util.List;

public class Calculo {

	public static int executaCalculo(int valor1, int valor2) {
		int soma = valor1 + valor2;
		return soma;
	}
	
	public static Long calculaDelta(Long a, Long b, Long c) {
		Long delta = (b*b) - 4 * a * c;
		
		return delta;
	}
	
	public static List<Long> calculaRaizes(Long a, Long b, Long c, Long delta) {
		Long raizDeDelta = (long) Math.sqrt(delta);
		
		Long x1 =  (-b + raizDeDelta) / 2L*a;
		Long x2 =  (-b - raizDeDelta) / 2L*a;
		
		List<Long> raizes = new ArrayList<Long>();
		raizes.add(x1);
		raizes.add(x2);
		
		return raizes;
	}
	
}