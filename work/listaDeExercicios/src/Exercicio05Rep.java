// 5.	Ler um conjunto de 5 dados num�ricos e imprimir sua soma e sua m�dia.
import java.util.Scanner;

public class Exercicio05Rep {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num;
		double soma = 0;
		int total;
		
		System.out.print("Digite a quantidade de n�meros: ");	
		total = teclado.nextInt();
				
		for (int i = 0; i < total; i++){
			System.out.print("Digite um n�mero: ");	
			num = teclado.nextDouble();
			soma = soma + num;
		}
				
		double	media = soma / total;
		
		System.out.println("\nA quantidade de n�meros �: "+total);
		System.out.println("\nA soma dos valores �: "+soma);
		System.out.println("A m�dia dos valores �: "+media);
	}
}
