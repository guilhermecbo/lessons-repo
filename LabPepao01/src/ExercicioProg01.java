/*INICIO
NUMERO, SUC, ANT: INTEIRO;

NUMERO=5;

ANT = NUMERO � 1;
SUC = NUMERO + 1;
ESCREVA(�O NUMERO ANTERIO � �, ANT, � E O N�MERO SUCESSOR � �, SUC);
FIM.
*/
import java.util.Scanner;
public class ExercicioProg01 {	
	
	static int n1, ant, suc;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
				
		System.out.print("Digite um n�mero: ");
		n1 = teclado.nextInt();
		
		ant = n1-1;
		suc = n1+1;
		
		System.out.println("O valor da n�mero �: "+n1);
		System.out.println("O n�mero anterior �: "+ant);
	    System.out.println("O n�mero sucessor �: "+suc);	
	}

}
