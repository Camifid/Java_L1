/* Fazer um programa para ler o código de uma peça 1, o
 * número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário
 * de cada peça 2. Calcule e mostre o valor a ser pago. 
 * 
 * Exemplos:
 * Entrada: 12 1 5.30 16 2 5.10 
 * Saída: VALOR A PAGAR: R$ 15.50
 * 
 * Entrada: 13 2 15.30 161 4 5.20
 * Saída: VALOR A PAGAR: R$ 51.40
 * 
 * Entrada: 1 1 15.10 2 1 15.10
 * Saída: VALOR A PAGAR: R$ 30.20
 * */

import java.util.Locale;
import java.util.Scanner;

public class List1_A5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, num1, cod2, num2;
		double val1, val2, total;
		
		System.out.println("Insira o codigo da peca 1: ");
		cod1 = sc.nextInt();
		
		System.out.println("Insira o numero de pecas 1: ");
		num1 = sc.nextInt();
		
		System.out.println("Insira o valor unitario da peca 1: ");
		val1 = sc.nextDouble();
		
		System.out.println("Insira o codigo da peca 2: ");
		cod2 = sc.nextInt();
		
		System.out.println("Insira o numero de pecas 2: ");
		num2 = sc.nextInt();
		
		System.out.println("Insira o valor unitario da peca 2: ");
		val2 = sc.nextDouble();
		
		total = (num1 * val1 + num2 * val2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
