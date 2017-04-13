/*
 13.	Maria quer saber quantos litros de gasolina precisa colocar em seu carro e quanto vai gastar para fazer uma viagem até a casa de sua irmã.
Dados extras:
-	Distância da casa de Maria até sua irmã : 520 km
-	Seu carro consome 12 Km/litro de combustível.
-	Ela abastece sempre no mesmo posto, onde o preço da gasolina é R$ 3,50 o litro.
Desenvolva um algoritmo onde o usuário digite a distância, o consumo e o valor do litro de combustível, com estes dados o algoritmo deverá calcular a quantidade de litros de combustível para a viagem e o custo da viagem e imprimir esses valores na tela.

 */
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double dist, consumo, precoGas, gastoGas, custo;
		
		System.out.print("Digite a distância: ");
		dist = teclado.nextDouble();
		System.out.print("Digite o consumo de combustível: ");
		consumo = teclado.nextDouble();
		System.out.print("Digite o preço da gasolina: ");
		precoGas = teclado.nextDouble();
		
		gastoGas = (dist/consumo);
		custo = gastoGas * precoGas;
		
		System.out.println("A quantidade de combustível necessária é de "+gastoGas+" litros");
		System.out.println("O custo total da viagem será de R$ "+custo);
		
	}

}
