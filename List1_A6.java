/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: 
 * A, B e C. Em seguida, calcule e mostre:
 * 
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 * 
 * Exemplos:
 * Entrada: 3.0 4.0 5.2 
 * Saida: TRIANGULO: 7.800 CIRCULO: 84.949 TRAPEZIO: 18.200 QUADRADO: 16.000 RETANGULO: 12.000
 * 
 * Entrada: 12.7 10.4 15.2 
 * Saída: TRIANGULO: 96.520 CIRCULO: 725.833 TRAPEZIO: 175.560 QUADRADO: 108.160 RETANGULO: 132.080
 * 
 * */

package List1;
import java.util.Locale;
import java.util.Scanner;

public class List1_A6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A, B, C;
		Double tri, cir, tra, qua, ret;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = (A * C) / 2;
		cir = 3.14159 * C * C;
		tra = ((A + B)* C)/2;
		qua = B * B;		
		ret = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", cir);
		System.out.printf("TRAPEZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		sc.close();
	}

}
