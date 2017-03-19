
/*
2-	Faça um algoritmo que possa receber o valor de um produto que custa R$50,00 e que
escreva o novo valor tendo em vista que o valor receba um desconto de 9%.
INICIO
PRECO, NPRECO: REAL;

PRECO=50,00
NPRECO = PRECO + (PRECO * 0,09);
ESCREVA(“PRECO COM DESCONTO: ”, NPRECO);
FIM.
*/  
 public class ExercicioProg02 {
	 
	 public static void main(String[] args) {
		 double preco = 50;
		 double desconto = 0.9;
		 double novoValor;
		 
		 novoValor = preco * desconto;
		 
		 System.out.println("O valor real é: R$"+preco);
		 System.out.print("O valor com desconto é: R$"+novoValor);

	}

}
