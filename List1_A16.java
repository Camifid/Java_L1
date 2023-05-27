/* Escreva um programa para ler as coordenadas (X,Y) de uma
 * quantidade indeterminada de pontos no sistema cartesiano. 
 * Para cada ponto escrever o quadrante a que ele pertence. 
 * O algoritmo será encerrado quando pelo menos uma de duas 
 * coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 * 
 * Exemplo:
 * Entrada: 2 2 3 -2 -8 -1 -7 1 0 2
 * Saída: primeiro quarto terceiro segundo
 * */

import java.util.Scanner;

public class List1_A16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
			System.out.println("primeiro");
			}
		
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
		
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			
			else {
				System.out.println("quarto");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
