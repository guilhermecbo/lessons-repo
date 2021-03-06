/*
 * Crie um ret�ngulo com apenas um System.out.print("*"):
 * 
 * Pergunte o n�mero da coluna inicial do ret�ngulo, com n�mero maior que zero.
 * Pergunte o comprimento do ret�ngulo entre 6 e 60.
 * Pergunte a altura entre 5 e 15.
 * Fa�a o teste de valores
 * Criar um contador de erros e encerrar ap�s tr�s erros.
 * 
 */
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis chamado o resultado dos m�todos
		int col = lerCol();
		int alt = lerAltura();		
		int comp = lerComp();
		
		// Desenho das linhas
		for (int l = 0; l < alt; l++){			
			// Desenho das colunas
			for (int colIn = 0 ; colIn < col; colIn++){
				System.out.print(" ");
			}
				// Desenho do comprimento do ret�ngulo
				for (int c = 0; c < comp; c++){
					System.out.print("*");
				}
			System.out.println();
		}//--------------------------------------------

	}//------------------------------------------------

	static int lerComp(){
		int c = 0;
		int contErro = 1;
		Scanner teclado = new Scanner(System.in);
		do{			
			System.out.print("Digite o valor para o comprimento [3 - 60]: ");
			c = teclado.nextInt();
			if (c < 3 || c > 60){
				// Incremento da vari�vel de controle de erros.
				contErro++;
				System.out.println("Valor fora do intervalo! Voc� errou "+contErro+" vezes!\n");
				if (contErro == 3){
					// O usu�rio errou 3 vezes e o programa ser� encerrado.
					System.out.println("Voc� errou "+contErro+" vezes! Programa encerrado!\n");
					System.exit(0);
				}
			}
		}while (c < 3 || c > 60);
		return c;
	}//------------------------------------------------
	
	static int lerAltura(){
		int a = 0;
		int contErro = 0;
		Scanner teclado = new Scanner(System.in);
		do{			
			System.out.print("Digite o valor para a altura [5 - 15]: ");
			a = teclado.nextInt();
			if (a < 5 || a > 15){
				// Incremento da vari�vel de controle de erros.
				contErro++;
				System.out.println("Valor fora do intervalo! Voc� errou "+contErro+" vezes!\n");
					if (contErro == 3){
						// O usu�rio errou 3 vezes e o programa ser� encerrado.
						System.out.println("Voc� errou "+contErro+" vezes! Programa encerrado!\n");
						System.exit(0);
					}
			}
		}while (a < 5 || a > 15);
		return a;
	}//------------------------------------------------
	
	static int lerCol(){
		int col = 0;
		int contErro = 0;
		Scanner teclado = new Scanner(System.in);
		do{			
			System.out.print("Digite o valor para a coluna inicial [Maior que 0]: ");
			col = teclado.nextInt();
			if (col < 0){
				// Incremento da vari�vel de controle de erros.
				contErro++;
				System.out.println("Valor fora do intervalo! Voc� errou "+contErro+" vezes!\n");
					if (contErro == 3){
						// O usu�rio errou 3 vezes e o programa ser� encerrado.
						System.out.println("Voc� errou "+contErro+" vezes! Programa encerrado!\n");
						System.exit(0);
				}
			}
		}while (col < 0);
		return col;
	}//------------------------------------------------
}//----------------------------------------------------
