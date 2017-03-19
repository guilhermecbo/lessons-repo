import java.util.Scanner;

public class Exercicio02 {
	
	static int n1,n2;

	public static void main(String[] args) {
		lerNumeros();		// Ler dois números
		trocarNumeros();	// Troca conteúdo das variáveis
		mostrarNumeros();	// Mostra o conteúdo das variáveis
	}// ---------------------------------------------------------------
	
	static void lerNumeros(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o N1: ");
		n1 = teclado.nextInt();
		System.out.print("Digite o N2: ");
		n2 = teclado.nextInt();
	}// ---------------------------------------------------------------
	
	static void mostrarNumeros(){
		System.out.println("O valor de N1 �: "+n1);
		System.out.print("O valor de N2 �: "+n2);
	}// ---------------------------------------------------------------
	
	static void trocarNumeros(){
		int aux = n1;
			n1  = n2;
			n2	= aux;
	}// ---------------------------------------------------------------
	
}
