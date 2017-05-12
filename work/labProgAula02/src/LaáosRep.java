import java.util.Scanner;

public class LaçosRep {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int k = 0;
		char op = 'S';
		
		while (op=='S' || op =='s'){
			System.out.println("Laço while");
			System.out.print("Continuar laço? S/N ");
			op = teclado.next().charAt(0);
					}
		System.out.println("Após o laço");
		/*
		System.out.println("");
		for(int i=0; k <5 ; k=k+1){
			System.out.println("Ok");
		}
		System.out.println("Após laço for");
	*/
	}

}
