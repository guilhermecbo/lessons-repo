/*
Fa�a um algorimto que leia um n�mero inteiro inicial(num) e calcule o pr�ximo n�mero.
o calculo ser� o seguinte: numProximo = num + numAnterior.
Caso n�o haja o numAnterior, some zero. (primeiro caso)
Realize o calculo para os pr�ximos dez n�meros.

Exemplo:
num = 3
3+0,3+3,6+3,9+6,...
3  ,6  ,9  ,15 ,...
 */ 
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num =0, numAnterior = 0, proximoNum=0;
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
	
		for (int cont = 0; cont < 10; cont++){
			proximoNum = num + numAnterior;
			numAnterior = num;
			num = proximoNum;
			System.out.print(proximoNum+" ,");
			}
	}
}
