package calculoDeJuros;

public class JucosCompostoAnual implements JurosComposto {

	@Override
	public double calcular(double principal, double juros, int time) {
		double total = principal;
		for(int i = 1; i <= time; i++) {
			total *= 1 + juros / 100;
		}
		return total;
	}

}
