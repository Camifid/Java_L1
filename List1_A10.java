/* Leia a hora inicial e a hora final de um jogo. A seguir calcule
 * a duração do jogo, sabendo que o mesmo pode começar em um dia e 
 * terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * 
 * Exemplos:
 * Entrada: 16 2 
 * Saída: O JOGO DUROU 10 HORA(S)
 * 
 * Entrada: 0 0 
 * Saída: O JOGO DUROU 24 HORA(S)
 * 
 * Entrada: 2 16
 * Saída: O JOGO DUROU 14 HORA(S)
 * */

import java.util.Scanner;

public class List1_A10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hInicial, hFinal, hTotal;
		
		System.out.println("Insira a hora inicial:");
		hInicial = sc.nextInt();
		
		System.out.println("Insira a hora final:");
		hFinal = sc.nextInt();
		
		if (hInicial < hFinal) {
			hTotal = hFinal - hInicial;
		}
		else {
			hTotal = 24 - hInicial + hFinal;
		}
		
		System.out.println("O JOGO DUROU " + hTotal + " HORA(S)");
		
		sc.close();
	}

}
