import java.util.Scanner;

public class La�osRep {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int k = 0;
		char op = 'S';
		
		while (op=='S' || op =='s'){
			System.out.println("La�o while");
			System.out.print("Continuar la�o? S/N ");
			op = teclado.next().charAt(0);
					}
		System.out.println("Ap�s o la�o");
		/*
		System.out.println("");
		for(int i=0; k <5 ; k=k+1){
			System.out.println("Ok");
		}
		System.out.println("Ap�s la�o for");
	*/
	}

}
