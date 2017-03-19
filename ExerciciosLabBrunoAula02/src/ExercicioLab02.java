/*
Faça um algoritmo, para calcular o valor final da venda de
produtos de uma loja. Para isso, solicite a quantidade vendida
e o preço unitário dos produto. Calcule o valor a ser pago
(quantidade vendida * preço unitário).

Inicio
Imprima “ – Informar Valores”.
Imprima “Digite a quantidade vendida:”.
Leia QtdItem.
Imprima “Digite o valor do produto:”.
Leia ValorItem.
ValorTotal = ValorTotal + (QtdItem * ValorItem).
Imprima “Valor total a ser pago: ” + ValorTotal.
Fim
 */
import java.util.Scanner;
public class ExercicioLab02 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double preco, quantidade, total;
		
		System.out.println("Informar valores\n");
		System.out.print("Digite a quantidade vendida: ");
	    quantidade = ler.nextDouble();
	    System.out.print("Digite o valor do produto: ");
	    preco = ler.nextDouble();
	    
	    total= preco*quantidade;
	    System.out.print("O valor total a sar pago é: R$ "+total);
	    
	}

}
