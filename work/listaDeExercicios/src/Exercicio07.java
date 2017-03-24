// 7.	Ler 3 números e imprimi-los em ordem crescente.
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Array com três posições
		int[] listaNumeros = new int[3];
		
			for (int i = 0; i< listaNumeros.length; i++){
			
			
				System.out.print("Digite um número: ");	
				listaNumeros[i] = (teclado.nextInt());
			
		}//----------------------------------------------------------
			
		// Coloca o array em ordem crescente	
		Arrays.sort(listaNumeros);
		// Lista o array
		System.out.print("ordem crescente: ");	
		for (int j = 0; j< listaNumeros.length; j++){
			System.out.print(listaNumeros[j]+ " ");	
		}//----------------------------------------------------------		
	}

}
