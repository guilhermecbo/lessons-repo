/*
11.	Escrever um algoritmo para ler uma temperatura em Fahrenheit e apresent�-la convertida em graus Cent�grados.
	(Fahrenheit � 32) x 5
F�rmula:	Cent�grados = 	----------------------------
	9

*/
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double temp, tempCent;
		
		System.out.print("Digite a tempertura em Fahrenheit: ");
		temp = teclado.nextDouble();

		
		tempCent = ((temp - 32) * 5)/9;		
		
		System.out.println("F�rmula: ");
		System.out.println("\n("+temp+" � 32) x 5");
		System.out.println("----------------");
		System.out.println("       9            \n");
		
		System.out.println("A temperatura em graus cent�grados �: "+tempCent+"C�");

	}

}
