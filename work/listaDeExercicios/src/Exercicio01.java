import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("Digite o valor de N1: ");
		n1 =  teclado.nextInt();
		System.out.print("Digite o valor de N2: ");
		n2 =  teclado.nextInt();
		
		System.out.println("\nO valor de N1 é: "+n1);
		System.out.println("O valor de N2 é: "+n2);
	}

}