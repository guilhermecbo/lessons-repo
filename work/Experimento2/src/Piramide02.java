
import java.util.Scanner;
public class Piramide02 {

	public static void main(String[] args) {
		String st = "";
		// Declara��o das vari�veis chamado o resultado dos m�todos
		int alt = lerLinhas();
		
		for (int l=0; l<=alt; l++)
			
			System.out.println(st += 1);
		//}
		for (int n=0; n<=alt; n++){
			System.out.println(st.subSequence(0,  9-1));
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
	
	private static String diminuiString(String st){
		String str = "";
		for (int k = 0; k < st.length() - 1; k++)
			str += st.charAt(k);
		return str;
	}
}//----------------------------------------------------
