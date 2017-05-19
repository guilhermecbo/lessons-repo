/*
8.	Faça um algoritmo que leia valores para as variáveis A, B e C e mostre o resultado da seguinte expressão:
( A – B ) * C

 */
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, exp;
		
		System.out.print("Digite o valor de A: ");
		a = teclado.nextInt();
		System.out.print("Digite o valor de B: ");
		b = teclado.nextInt();
		System.out.print("Digite o valor de C: ");
		c = teclado.nextInt();
		
		exp = (a - b) * c;
		
		System.out.print("O resultado da expressão é: ("+a+" - "+b+") * "+c+" = "+exp);

	}

}
