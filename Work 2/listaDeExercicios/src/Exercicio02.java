// 2.	Escreva um algoritmo que leia dois números que deverão ser colocados, respectivamente
// nas variáveis VA e VB.  O algoritmo deve, então, trocar os valores de VA por VB e vice-versa 
// e mostrar o conteúdo destas variáveis na mesma ordem VA e VB.
import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double vA, vB;
		
		System.out.print("Digite o valor de vA: ");
		vA = teclado.nextDouble();
		System.out.print("Digite o valor de vB: ");
		vB = teclado.nextDouble();
		
		double aux = vA;
		vA = vB;		
		vB = aux;
		
		System.out.print("O conteúdo de vA: "+vA+"\nO conteúdo de vB: "+vB);
	}

}
