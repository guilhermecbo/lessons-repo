/*
9.	Fa�a um algoritmo que mostre o resultado da express�o abaixo:
(( x � 5) * y) � z
Obs: Ler valores para as vari�veis x, y e z.

 */
import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y, z, exp;
		
		System.out.print("Digite o valor de X: ");
		x = teclado.nextInt();
		System.out.print("Digite o valor de Y: ");
		y = teclado.nextInt();
		System.out.print("Digite o valor de Z: ");
		z = teclado.nextInt();
		
		exp = ((x-5) * y)-z;
		
		System.out.print("O valor da express�o �: (("+x+" -"+" 5)"+" * "+y+") - "+z+" = "+exp);

	}

}
