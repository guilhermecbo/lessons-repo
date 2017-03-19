/*
3-	Faça um algoritmo que receba um número e se ele for maior que 20, então escreva a metade desse número.

INICIO
NUMERO, METADE: REAL;

NUMERO= 20

SE (NUMERO > 20) ENTAO
METADE = NUMERO/2;
ESCREVA(“A METADE É: ”, METADE);
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
        
        System.out.println("O valor de N1 é: "+n1);
        
        if(n1>20){
        	metade=n1/2;
        	System.out.print("A metade de N1 é: "+metade);
        
        
        }
        
        
        
	}

}
