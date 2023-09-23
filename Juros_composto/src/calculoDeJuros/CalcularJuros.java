package calculoDeJuros;

import java.util.Scanner;

public class CalcularJuros {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	    // Solicita ao usuário para inserir os valores
	    System.out.print("Insira o valor inicial: ");
	    double principal = scanner.nextDouble();

	    System.out.print("Insira a taxa de juros: ");
	    double interestRate = scanner.nextDouble();

	    System.out.print("Insira o tempo: ");
	    int time = scanner.nextInt();
		
	    // Injeta a classe de algoritmo adequada no código principal
		JurosComposto calcularJuros = new JucosCompostoAnual();
		
		double total = calcularJuros.calcular(100, 0.05, 5);
		System.out.println("Montante final:" + total);
	}
}
