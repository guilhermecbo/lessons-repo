/*
 * 5.	Ler um conjunto de 5 dados num�ricos e imprimir sua soma e sua m�dia.
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
			System.out.println("A soma dos n�meros �: "+soma);
			System.out.println("A m�dia dos n�meros �: "+media);
		}//---------------------------------------------------------------
	}//---------------------------------------------------------------
	
	static int pergunta(){
		System.out.println("Digite o n�mero de vezes do la�o: ");
		return (int)lerNumero();
	}//---------------------------------------------------------------
	
	static double lerNumero(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		return teclado.nextInt();		
	}//---------------------------------------------------------------
}