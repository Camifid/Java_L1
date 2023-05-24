/* Você deve fazer um programa que leia um valor qualquer e apresente
 * uma mensagem dizendo em qual dos seguintes intervalos ([0,25], 
 * (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o
 * valor não estiver em nenhum destes intervalos, deverá ser impressa 
 * a mensagem “Fora de intervalo”.
 * 
 * Exemplos:
 * Entrada: 25.01
 * Saída: Intervalo (25,50]
 * 
 * Entrada: 25.00
 * Saída: Intervalo [0,25]
 * 
 * Entrada: 100.00
 * Saída: Intervalo (75,100]
 * 
 * Entrada: -25.02
 * Saída: Fora de intervalo
 * */

import java.util.Locale;
import java.util.Scanner;

public class List1_A12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double N;
		
		System.out.println("Insira um numero:");
		N = sc.nextDouble();
		
		if (N < 0.0 || N > 100.0) {
			System.out.println("Fora do Intervalo");
		}
		else if (N <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		
		else if (N <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}

		else if (N  <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}
		
		else   {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}
}
