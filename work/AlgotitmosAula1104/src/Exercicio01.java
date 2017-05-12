/*
Fazer um Algoritmos em Java que receba 3 números inteiros.
Verifique se estes números formam um triângulo.
Caso não forme um triângulo imprima a mensagem 
   "NÚMEROS NÃO FORMAM UM TRIANGULO! Digite os números novamente."
Caso formem, imprima a mensagem "NÚMEROS FORMAM UM TRIANGULO"
e diga qual o tipo de triangulo "EQUILÁTERO", "RETANGULO" ou "ISÓSCELES"

Em um triângulo isósceles os ângulos da base são congruentes.

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
				System.out.println("Os valores não formam um triângulo!");
				System.exit(0);
			}
		}while (c>(a+b) || a>(b+c) || b > (a+c));		

		if (a == b && a == c) {
			tipoTriangulo = "Equilátero";
		}else if (a == c && a > b){
			tipoTriangulo = "Isósceles";
		}else if (c<(a+b) || a<(b+c) || b< (a+c)){
			tipoTriangulo = "Retângulo";
		}//----------------------------------------------------------------------
		
		System.out.println("\nOs números formam um triângulo do tipo: "+tipoTriangulo);
	}
}
