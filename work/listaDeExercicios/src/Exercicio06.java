// 6.	Fazer um algoritmo para ler dois números e mostrar o maior deles.
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Digite o valor de N1: ");
		n1 = teclado.nextInt();
		System.out.println("Digite o valor de N2: ");
		n2 = teclado.nextInt();
		
		int aux = n1;
		
		if (n2 > aux){
			System.out.println("\nO maior valor é: "+n2);
		}
		
		else {
			System.out.println("O maior valor é: "+aux);
		}
	}
}
