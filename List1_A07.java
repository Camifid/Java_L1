/* Faça um programa para ler um número inteiro, e depois
 * dizer se este número é negativo ou não.
 * 
 * Exemplos:
 * Entrada: -10
 * Saída: Negativo
 * 
 * Entrada: 8
 * Saída: Não Negativo
 * 
 * Entrada: 0
 * Saída: Não Negativo
 * */

import java.util.Locale;
import java.util.Scanner;

public class List1_A7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		int num;
		
		System.out.println("Insira um número:");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("Nao Negativo");
		}
		else if (num < 0) {
			System.out.println("Negativo");
		}
		
		sc.close();

	}

}
