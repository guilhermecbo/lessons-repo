import java.util.Scanner;

public class Calculadora {
	Scanner teclado = new Scanner(System.in);
	static double n1, n2;

	//static char oper;
	static boolean ok1, ok2, ok3;
	static int opcaoMenu;
	static boolean operTeste;
	private char op;
	static boolean finalizar;
	
	public static void main(String[] args) {	
		do{
			menuPrincipal();
		}while (!finalizar);
		
	}
	
	public static double setN1(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de N1: ");
		n1 = teclado.nextDouble();
		return n1;
	}
	
	public static double setN2(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de N2: ");
		n2 = teclado.nextDouble();
		return n2;
	}

	public static char digitaOperacao(){
		char op;
		do {
			
		} while (op != '+' && op != '-' && op != '*' && op != '/');
	}
	
	static int menuPrincipal(){
		int a = 0;
		Scanner teclado = new Scanner(System.in);
	do{			
		System.out.println("---------------- Menu -------------------");
		System.out.println("1 - N1");
		System.out.println("2 - Operação");
		System.out.println("3 - N2");
		System.out.println("4 - Resultado");
		System.out.println("5 - Fim\n");
		System.out.print("Digite a opção: ");
		a = teclado.nextInt();
		if (a < 1 || a > 5){
			System.out.println("Opção inválida!");
		}
		
		
		switch(op){
			case '1':{
				setN1();
				ok1 = true;
				break;
				 
		}
			
		}
		if (a == 4){
			if (operTeste == false){
				System.out.println("Os valores não foram preenchidos!");
				break;
			}
		}
		if (a == 3){
			setN2();
		}
			
	}while (a < 1 || a > 5);
	return a;
	}
}
