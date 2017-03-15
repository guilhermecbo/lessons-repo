// 5.	Ler um conjunto de 5 dados numéricos e imprimir sua soma e sua média.
import java.util.Scanner;

public class Exercicio05Rep {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num;
		double soma = 0;
		int total;
		
		System.out.print("Digite a quantidade de números: ");	
		total = teclado.nextInt();
				
		for (int i = 0; i < total; i++){
			System.out.print("Digite um número: ");	
			num = teclado.nextDouble();
			soma = soma + num;
		}
				
		double	media = soma / total;
		
		System.out.println("\nA quantidade de números é: "+total);
		System.out.println("\nA soma dos valores é: "+soma);
		System.out.println("A média dos valores é: "+media);
	}
}
