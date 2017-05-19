import java.util.Scanner;
public class Exercicio06Lab {

	public static void main(String[] args) {
		// ler dois números
		// Mostrar o maior
		while(continua())
			System.out.print("\nO Maior número é: "+mostraMaior(lerNumero(), lerNumero()));
		

	}//---------------------------------------------------------------

	static String mostraMaior(int numero1, int numero2) {
		if (numero1 > numero2){
			return ""+numero1;
		}
		return ""+numero2;
	}//---------------------------------------------------------------
	
	static boolean continua(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("digitar mais valores? s/n ");
		//String resposta = teclado.next();
		char r = teclado.next().toLowerCase().charAt(0);
		if( r == 's'){
			return true;
		}
		return false;
	}//---------------------------------------------------------------
	
	static int lerNumero(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		return teclado.nextInt();		
	}//---------------------------------------------------------------

}
