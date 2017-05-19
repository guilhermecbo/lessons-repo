
import java.util.Scanner;
public class Piramide01 {

	public static void main(String[] args) {
		
		// Declaração das variáveis chamado o resultado dos métodos
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
				// Incremento da variável de controle de erros.
				contErro++;
				System.out.println("Valor fora do intervalo! Você errou "+contErro+" vezes!\n");
					if (contErro == 3){
						// O usuário errou 3 vezes e o programa será encerrado.
						System.out.println("Você errou "+contErro+" vezes! Programa encerrado!\n");
						System.exit(0);
					}
			}
		}while (a < 1 || a > 10);
		return a;
	}//------------------------------------------------
	
}//----------------------------------------------------
