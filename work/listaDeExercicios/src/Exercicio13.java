/*
 13.	Maria quer saber quantos litros de gasolina precisa colocar em seu carro e quanto vai gastar para fazer uma viagem at� a casa de sua irm�.
Dados extras:
-	Dist�ncia da casa de Maria at� sua irm� : 520 km
-	Seu carro consome 12 Km/litro de combust�vel.
-	Ela abastece sempre no mesmo posto, onde o pre�o da gasolina � R$ 3,50 o litro.
Desenvolva um algoritmo onde o usu�rio digite a dist�ncia, o consumo e o valor do litro de combust�vel, com estes dados o algoritmo dever� calcular a quantidade de litros de combust�vel para a viagem e o custo da viagem e imprimir esses valores na tela.

 */
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double dist, consumo, precoGas, gastoGas, custo;
		
		System.out.print("Digite a dist�ncia: ");
		dist = teclado.nextDouble();
		System.out.print("Digite o consumo de combust�vel: ");
		consumo = teclado.nextDouble();
		System.out.print("Digite o pre�o da gasolina: ");
		precoGas = teclado.nextDouble();
		
		gastoGas = (dist/consumo);
		custo = gastoGas * precoGas;
		
		System.out.println("A quantidade de combust�vel necess�ria � de "+gastoGas+" litros");
		System.out.println("O custo total da viagem ser� de R$ "+custo);
		
	}

}
