/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando 
 * se os valores lidos são múltiplos entre si. Atenção: os números 
 * devem poder ser digitados em ordem crescente ou decrescente.
 * 
 * Exemplos:
 * Entrada:
 * Saída:
 * 
 * Entrada:
 * Saída:
 * 
 * Entrada:
 * Saída:
 * */

import java.util.Scanner;

public class List1_A9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Insira o primeiro valor:");
		A = sc.nextInt();
		
		System.out.println("Insira o segundo valor:");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao multiplos!");
		}
		else {
			System.out.println("Nao sao multiplos!");
		}
	
		sc.close();
	}
}
