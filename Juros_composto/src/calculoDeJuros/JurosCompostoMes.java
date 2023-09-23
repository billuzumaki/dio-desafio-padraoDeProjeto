package calculoDeJuros;

public class JurosCompostoMes implements JurosComposto {

	@Override
	public double calcular(double principal, double juros, int time) {
		double total = principal;
		for (int i = 1; i <= time * 12; i++) {
			total *= 1 + juros / 100 / 12;
		}
		return total;
	}

}
