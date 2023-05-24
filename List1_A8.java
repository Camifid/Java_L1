/*  Fazer um programa para ler um número inteiro e dizer
 *  se este número é par ou ímpar.
 * 
 *  Exemplos:
 *  Entrada: 12
 *  Saída: Par
 *  
 *  Entrada -27
 *  Saída: Impar
 *  
 *  Entrada: 0 
 *  Saída: Par
 * */

import java.util.Scanner;

public class List1_A8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um numero:");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		}
		
		else {
			System.out.println("Impar");
		}
		
		sc.close();
	}

}
