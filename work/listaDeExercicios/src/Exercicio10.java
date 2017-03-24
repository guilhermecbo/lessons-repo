/*
 10.	Fazer um algoritmo para ler duas notas, os pesos de cada nota e mostrar a média ponderada.  
	(nota 1 * peso da nota 1) + (nota 2 * peso da nota 2)
Cálculo da Média Ponderada =                           ------------------------------------------------------------------------
	soma dos pesos

 */
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, peso1, peso2, mediaPonderada, somaPesos;
		
		System.out.print("Digite a nota 1: ");
		nota1 = teclado.nextDouble();
		System.out.print("Digite o peso da nota 1: ");
		peso1 = teclado.nextDouble();
		System.out.print("Digite a nota 2: ");
		nota2 = teclado.nextDouble();
		System.out.print("Digite o peso da nota 2: ");
		peso2 = teclado.nextDouble();
		
		somaPesos = peso1+peso2;
		mediaPonderada = ((nota1*peso1) + (nota2*peso2)) / somaPesos;
		
		System.out.println("                   ("+nota1+" * "+peso1+") + ("+nota2+" * "+peso2+")");
		System.out.println("Média ponderada = ------------------------------ = "+mediaPonderada);
		System.out.println("                               "+somaPesos);

	}

}
