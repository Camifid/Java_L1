/* Fazer um programa para ler um número N. Depois leia N pares 
 * de números e mostre a divisão do primeiro pelo segundo. Se o 
 * denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 * 
 * Exemplo: 
 * Entrada: 3 3 -2 -8 0 0 8
 * Saída: -1.5 divisao impossivel 0.0
 * */
import java.util.Scanner;
public class List1_A21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(b == 0) {
				System.out.println("divisao impossivel"); }
			
			else {
				double div = (double) a/b; // troquei o tipo
				System.out.printf("%.1f%n", div); }
		}		
		sc.close();
	}
}
