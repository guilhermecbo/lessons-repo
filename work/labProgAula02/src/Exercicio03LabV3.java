import java.util.Scanner;

public class Exercicio03LabV3 {
	static double soma;
	
	public static void main(String[] args) {
		// ler dois numeros
		double n1 = lerNumero();
		double n2 = lerNumero();
		
		// Realizar a soma
		somaNumeros (n1, n2);
		
		// Imprimir a soma
		System.out.print("A soma de N1 com N2 é: "+soma);
	}//---------------------------------------------------------------
	
	static void somaNumeros(double n1, double n2){
		soma = n1+n2;
	}//---------------------------------------------------------------
	
	static double lerNumero(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o número: ");
		double numeroLido = teclado.nextDouble();
		return numeroLido;
	}//---------------------------------------------------------------

}
