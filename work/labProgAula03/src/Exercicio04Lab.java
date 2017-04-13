import java.util.Scanner;
public class Exercicio04Lab {

	public static void main(String[] args) {
		// ler 3 números
		double n1 = lerNumero();
		double n2 = lerNumero();
		double n3 = lerNumero();
		// Mostrar a média
		System.out.print("A média é: "+media(n1,n2,n3));

	}//--------------------------------------------------------
	
	static double media(double num1, double num2, double num3){
		return (num1+num2+num3)/3;
	}//--------------------------------------------------------
	
	static double lerNumero(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		return teclado.nextDouble();
	}//--------------------------------------------------------
	
}
/*
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04Lab {
int nomeInd, notaInd;

	public static void main(String[] args) {
		//int nomeInd = 3;
		//int notaInd = 3;
		Scanner teclado = new Scanner(System.in);
		double[] lerNota = new double[3];
		char[] lerNome = new char[3];
		
		for (int i = 0; i< lerNota.length; i++){
			System.out.print("Digite o nome: ");	
			lerNome[i] = (teclado.next());
			System.out.print("Digite o nome: ");	
			lerNota[i] = (teclado.nextInt());
		}
		
		//Arrays.sort(listaNumeros);
		// Lista o array
		System.out.print("ordem crescente: ");	
		for (int j = 0; j< lerNota.length; j++){
			System.out.print(lerNome[j]+ " ");	
			System.out.print(lerNota[j]+ " ");	
		}
	}
	
}
*/