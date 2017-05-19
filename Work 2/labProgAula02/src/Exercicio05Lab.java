/*
 * 5.	Ler um conjunto de 5 dados numéricos e imprimir sua soma e sua média.
 */
import java.util.Scanner;
public class Exercicio05Lab {

	public static void main(String[] args) {
		//int num = 0;
		int soma = 0;
		int limite = 0;
		int contador = 0;
		
		/*do{
			num = lerNumero();
		if (num > 0){
			soma+= num;
			contador++;
			}else break;
		}while (true);
		*/
		pergunta();
		
		for (int i = 0; i < limite; i++){
			soma+= lerNumero();
		}//---------------------------------------------------------------
		
		int media = soma/contador;
		
		if (contador >0){
			System.out.println("A soma dos números é: "+soma);
			System.out.println("A média dos números é: "+media);
		}//---------------------------------------------------------------
	}//---------------------------------------------------------------
	
	static int pergunta(){
		System.out.println("Digite o número de vezes do laço: ");
		return (int)lerNumero();
	}//---------------------------------------------------------------
	
	static double lerNumero(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		return teclado.nextInt();		
	}//---------------------------------------------------------------
}