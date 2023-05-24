/* Com base na tabela abaixo, escreva um programa que leia 
 * o código de um item e a quantidade deste item. A seguir, 
 * calcule e mostre o valor da conta a pagar.
 * 
 *  codigo   especificação       preço
 *    1      cachorro quente     R$4.00
 *    2      x-salada            R$4.50
 *    3      x-bacon             R$5.00
 *    4      torrada simples     R$2.00
 *    5      refrigerante        R$1.50
 * 
 * Exemplos:
 * Entrada: 3 2
 * Saída: Total R$10.00
 * 
 * Entrada: 2 3
 * Saída: Total R$13.50
 * */

import java.util.Scanner;
import java.util.Locale;

public class List1_A11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cod, qtde;
		double preco;
		
		System.out.println("Insira o codigo do item:");
		cod = sc.nextInt();
		
		System.out.println("Insira a quantidade que deseja do item:");
		qtde = sc.nextInt();
		
		if (cod == 1) {
			preco = qtde * 4.00;
		}
		else if (cod == 2) {
			preco = qtde * 4.50;
		}
		else if (cod == 3) {
			preco = qtde * 5.0;
		}
		else if (cod == 4) {
			preco = qtde * 2.0;
		}
		else {
		    preco = qtde * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", preco);
		
		sc.close();
	}
}
