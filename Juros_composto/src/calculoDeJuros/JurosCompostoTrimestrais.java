package calculoDeJuros;

import java.util.Iterator;

public class JurosCompostoTrimestrais implements JurosComposto {

	@Override
	public double calcular(double principal, double juros, int time) {
		double total = principal;
		for (int i = 1; i <= time * 4; i++) {
			total *= 1 + juros / 100 / 4;
		}
		return total;
	}
	
}
