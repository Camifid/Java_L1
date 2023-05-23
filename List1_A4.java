/* Fazer um programa que leia o número de um funcionário, seu
 * número de horas trabalhadas, o valor que recebe por hora e
 * calcula o salário desse funcionário. A seguir, mostre o
 * número e o salário do funcionário, com duas casas decimais.
 * 
 * Exemplos:
 * Entrada: 25 100 5.50
 * Saída: NUMBER = 25 SALARY = U$ 550.00
 * 
 * Entrada: 1 200 20.50 
 * Saída: NUMBER = 1 SALARY = U$ 4100.00
 * 
 * Entrada: 6 145 15.55 
 * Saída: NUMBER = 6 SALARY = U$ 2254.75 */

package List1;
import java.util.Scanner;
import java.util.Locale;

public class List1_A4 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nFuncionario, nHoras;
		double nGanho, salario;
		
		System.out.println("Digite o numero do funcionario: ");
		nFuncionario = sc.nextInt();
		
		System.out.println("Digite o numero de horas trabalhadas: ");
		nHoras = sc.nextInt();
		
		System.out.println("Digite o valor ganho por hora: ");
		nGanho = sc.nextDouble();
		
		salario = nHoras * nGanho;
		
		System.out.println("NUMBER = " + nFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
	}

}
