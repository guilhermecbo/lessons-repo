
import java.util.Scanner;
public class Piramide01 {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis chamado o resultado dos m�todos
		int alt = lerLinhas();
		for (int l=0; l<=alt; l++){
			
		for (int c = 0; c<l; c++)
			System.out.print(c);
			System.out.println();
		}
		for (int d=alt-1; d>0; d--){
			
			for (int f = 0; f<d; f++)
			System.out.print(f);
			System.out.println();
			
		}

	}//------------------------------------------------
	
	static int lerLinhas(){
		int a = 0;
		int contErro = 0;
		Scanner teclado = new Scanner(System.in);
		do{			
			System.out.print("Digite a quantidade de linhas [1 - 10]: ");
			a = teclado.nextInt();
			if (a < 1 || a > 10){
				// Incremento da vari�vel de controle de erros.
				contErro++;
				System.out.println("Valor fora do intervalo! Voc� errou "+contErro+" vezes!\n");
					if (contErro == 3){
						// O usu�rio errou 3 vezes e o programa ser� encerrado.
						System.out.println("Voc� errou "+contErro+" vezes! Programa encerrado!\n");
						System.exit(0);
					}
			}
		}while (a < 1 || a > 10);
		return a;
	}//------------------------------------------------
	
}//----------------------------------------------------
