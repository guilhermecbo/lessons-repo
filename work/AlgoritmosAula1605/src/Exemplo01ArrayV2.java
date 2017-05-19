import java.util.Scanner;
public class Exemplo01ArrayV2 {

	public static void main(String[] args) {
		do{
			System.out.println("------------------------------------------------");
			System.out.println("                 Menu");
			System.out.println("------------------------------------------------");
			System.out.println("Digite a opção desejada:\n");
			System.out.println("1 - Preencher o array");
			System.out.println("2 - Mostrar o array");
			System.out.println("3 - Mostra Soma");
			System.out.println("");
			System.out.println("");
			int op = new Scanner(System.in).nextInt();
			
			//if (op ==1) preencheArray();
			if (op == 3) mostraSoma();
			
			
		} while(true);
	}
		
		
		
		
		
		

		
		
		
		

		
		/*media = soma/i;
		porcentImpar = (100*numImpar)/i;
		
		System.out.println("A soma dos valores é "+soma+". \nA média dos números é: "+media+". \nNúmeros acima da média: ");
		for (i=0; i<10; i++){
			if (vetor[i]> media){
				System.out.println(vetor[i]+" no indice "+i);
			} 
		}
		System.out.println("A porcentagem de números impares é: "+porcentImpar+"%");
	}*/
	
	private static void mostraSoma(){
		int soma = 0;
		
		int vetor[] = new int[10];
		for (int k = 0; k < vetor.length; k++)
			soma += vetor[k];
		System.out.println("A soma dos valores é "+soma);
	}
	/*private static void preencheArray(){
		for (int j=0; j<10; j++){
			
			System.out.print("Digite um valor para o array "+j+" :");
			int vetor[i] = new Scanner(Sytem.in).nextInt();
			int soma = vetor[i] + soma;
			if (vetor[i]%2 == 1){
				numImpar++;
			}
			i++;
		}*/
	}


