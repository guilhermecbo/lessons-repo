// 5.	Ler um conjunto de 5 dados num�ricos e imprimir sua soma e sua m�dia.
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2, n3, n4, n5;
		
		System.out.print("Digite o valor de N1: ");
		n1 = teclado.nextInt();
		System.out.print("Digite o valor de N2: ");
		n2 = teclado.nextInt();
		System.out.print("Digite o valor de N3: ");
		n3 = teclado.nextInt();
		System.out.print("Digite o valor de N4: ");
		n4 = teclado.nextInt();
		System.out.print("Digite o valor de N5: ");
		n5 = teclado.nextInt();
		
		int 	soma = n1+n2+n3+n4+n5;		
		double 	media = soma / 5.0;
		
		System.out.println("A soma dos valores �: "+soma);
		System.out.println("A m�dia dos valores �: "+media);
	}
}
