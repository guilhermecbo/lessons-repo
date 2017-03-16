import java.util.Scanner;

public class Exercicio03Lab {
	static int n1, n2;
	
	public static void main(String[] args) {
		lerNumeros();										// Ler dois números
		int soma = somaNumeros();							// Realizar a soma
		System.out.print("A soma de N1 com N2 é: "+soma);	// Mostra o resultado
	}//---------------------------------------------------------------
	
	static void lerNumeros(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de N1: ");
		n1 = teclado.nextInt();
		System.out.print("Digite o valor de N2: ");
		n2 = teclado.nextInt();
	}//---------------------------------------------------------------
	
	static int somaNumeros(){
		return n1+n2;
	}//---------------------------------------------------------------
}
