/*
 12.	Ler um número N e imprimir F1, F2 ou F3, conforme a condição:
 	se N <= 10 imprima F1,
	se N > 10 e <= 100 imprima F2
	se N >100 imprima F3.

 */
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Digite um valor: ");
		num = teclado.nextInt();
		
		if(num <= 10){
			System.out.print("F1");
			
			}if (num > 10 && num <= 100){
				System.out.print("F2");
				}
					if (num > 100){
						System.out.print("F3");
			
					}
			}

}
