
import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis chamado o resultado dos m�todos

		int alt = lerAltura();		
		
		for(int i=alt; i>0; i--) {
		    for(int j=0; j<i; j++) System.out.print(" ");
			for(int j=i-1; j<alt; j++) System.out.print("*");
		    
		    for(int j=i; j<alt; j++) System.out.print("*");
		    System.out.println();
		}

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
	
}//----------------------------------------------------
