// 3.	Ler dois valores numéricos e escrever a soma destes.
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Digite o valor de N1: ");
		n1 = teclado.nextInt();
		System.out.print("Digite o valor de N2: ");
		n2 = teclado.nextInt();
		
		int soma = n1+n2;		
		System.out.print("A soma dos dois valores é: "+soma);
	}
}
