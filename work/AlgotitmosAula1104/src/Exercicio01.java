/*
Fazer um Algoritmos em Java que receba 3 n�meros inteiros.
Verifique se estes n�meros formam um tri�ngulo.
Caso n�o forme um tri�ngulo imprima a mensagem 
   "N�MEROS N�O FORMAM UM TRIANGULO! Digite os n�meros novamente."
Caso formem, imprima a mensagem "N�MEROS FORMAM UM TRIANGULO"
e diga qual o tipo de triangulo "EQUIL�TERO", "RETANGULO" ou "IS�SCELES"

Em um tri�ngulo is�sceles os �ngulos da base s�o congruentes.

*/
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;

		String tipoTriangulo = ""; 
		
		System.out.print("Digite o valor do lado A: ");
		a = ler.nextInt();
		System.out.print("Digite o valor do lado B: ");
		b = ler.nextInt();
		System.out.print("Digite o valor do lado C: ");
		c = ler.nextInt();
		
		// Executa o teste dos valores.
		do{
			if (c>(a+b) || a>(b+c) || b> (a+c)){
				System.out.println("Os valores n�o formam um tri�ngulo!");
				System.exit(0);
			}
		}while (c>(a+b) || a>(b+c) || b > (a+c));		

		if (a == b && a == c) {
			tipoTriangulo = "Equil�tero";
		}else if (a == c && a > b){
			tipoTriangulo = "Is�sceles";
		}else if (c<(a+b) || a<(b+c) || b< (a+c)){
			tipoTriangulo = "Ret�ngulo";
		}//----------------------------------------------------------------------
		
		System.out.println("\nOs n�meros formam um tri�ngulo do tipo: "+tipoTriangulo);
	}
}
