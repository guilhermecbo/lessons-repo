/*
3-	Fa�a um algoritmo que receba um n�mero e se ele for maior que 20, ent�o escreva a metade desse n�mero.

INICIO
NUMERO, METADE: REAL;

NUMERO= 20

SE (NUMERO > 20) ENTAO
METADE = NUMERO/2;
ESCREVA(�A METADE �: �, METADE);
FIMSE
FIM.

*/
import java.util.Scanner;
public class ExercicioProg03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, metade;
		
        System.out.print("Digite um valor: ");
        n1 = ler.nextInt();
        
        System.out.println("O valor de N1 �: "+n1);
        
        if(n1>20){
        	metade=n1/2;
        	System.out.print("A metade de N1 �: "+metade);
        
        
        }
        
        
        
	}

}
