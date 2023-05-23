/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela 
 * a soma desses números com uma mensagem explicativa, conforme exemplos:
 * 
 * Entrada: 10 e 30
 * Saída: SOMA = 40
 * 
 * Entrada: -30 e 10
 * Saída: SOMA = -20
 * 
 * Entrada: 0 e 0
 * Saída: SOMA = 0 */

import java.util.Scanner;

public class List1_A1 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int largura = sc.nextInt();
		int altura = sc.nextInt();
		int soma;
	
		soma = largura + altura;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
