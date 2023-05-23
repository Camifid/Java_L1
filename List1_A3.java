/* Fazer um programa para ler quatro valores inteiros A, B, C e D. 
 * A seguir, calcule e mostre a diferença do produto de A e B pelo 
 * produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). 
 * 
 * Exemplos:
 * Entrada: 5 6 7 8
 * Saída: DOFERENCA = - 26
 * 
 * Entrada: 5 6 -7 8
 * Saída: DIFERENCA = 86 */

import java.util.Scanner;

public class List1_A3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		diferenca = (A*B-C*D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
	}

}
