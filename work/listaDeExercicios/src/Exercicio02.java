// 2.	Escreva um algoritmo que leia dois n�meros que dever�o ser colocados, respectivamente
// nas vari�veis VA e VB.  O algoritmo deve, ent�o, trocar os valores de VA por VB e vice-versa 
// e mostrar o conte�do destas vari�veis na mesma ordem VA e VB.
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
		
		System.out.print("O conte�do de vA: "+vA+"\nO conte�do de vB: "+vB);
	}

}
