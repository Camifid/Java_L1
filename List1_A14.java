/* Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar 
 * de Imposto de Renda, segundo a tabela abaixo.
 * 
 * Renda                                Imposto de Renda
 * de 0.00 a R$ 2000.00                 Isento
 * de R$ 2000.01 até R$ 3000.00         8%
 * de R$ 3000.01 até R$ 4500.00         18%
 * acima de R$ 4500.00                  28%
 * 
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% 
 * apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até 
 * R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a 
 * taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 
 * no total. O valor deve ser impresso com duas casas decimais.
 * 
 * Exemplos:
 * Entrada: 3002.00
 * Saída: R$ 80.36
 * 
 * Entrada: 1701.12
 * Saída: Isento
 * 
 * Entrada: 4520.00
 * Saída: R$ 355.60
 * */

import java.util.Locale;
import java.util.Scanner;

public class List1_A14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N, total;
		
		System.out.println("Insira o valor do seu salario:");
		N = sc.nextDouble();
		
		if (N <= 2000.00 && N > 0.0) {
			System.out.println("Isento");
		}
		
		else if (N <= 3000.00) {
			total = (N - 2000.0)*0.08;
			System.out.printf("R$ %.2f%n", total);
		}
		
		else if (N <= 4500.00) {
			total = (N - 3000.0)*0.18 + 1000.0 *0.08;
			System.out.printf("R$ %.2f%n", total);
		}
		
		else {
			total = (N - 4500.0)*0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", total);
		}
		
		sc.close();
	}
}
