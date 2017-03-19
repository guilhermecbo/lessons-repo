/*
4-	Construa um algoritmo que receba dois números e efetue a adição. 
Caso o valor somado seja maior que 20, este deverá ser apresentado somando-se a ele mais 8; 
caso o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.

INICIO
NUM1, NUM2, SOMA: REAL;

NUM1=10
NUM2=7

SOMA = NUM1 + NUM2;

SE (SOMA > 20) ENTAO
	SOMA = SOMA + 8;
SENAO
SOMA = SOMA -  5;
FIMSE
SOMA + 8
FIM

 */
import java.util.Scanner;
public class ExercicioProg04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, soma;
		
		System.out.print("Digite o valor de n1: ");
        n1 = ler.nextInt();
        System.out.print("Digite o valor de n2: ");
        n2 = ler.nextInt();
        
        soma = n1 + n2;
        
        if (soma > 20){
        	System.out.print("O valor da soma dos números é: "+(soma+8));
        }
        
        else {
        	System.out.print("O valor da soma dos números é: "+(soma-5));
        } 
        
	}

}
