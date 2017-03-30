import java.util.Scanner;
public class Exercicio04LabV2 {

	public static void main(String[] args) {
		// ler 3 números
		int idade = 0;
		int soma = 0;
		int contador = 0;
		
		do{
			idade = lerIdade();
			if (idade > 0){
				soma+= idade;
				contador++;
			}
			else break;
		}while (true);
		
		if (contador > 0)
			System.out.println("\nMédia = "+(double)soma/contador);	

	}
	static int lerIdade(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a idade: ");
		return teclado.nextInt();
	}
}