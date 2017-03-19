/*
Faça um algoritmo, que determine qual é a
idade que o usuário faz no ano atual. Para isso
solicite o seu ano de nascimento e o ano atual.

Inicio
Imprima “Digite o ano de seu nascimento: ”.
Leia AnoNasc.
Imprima “Digite o ano atual: ”.
Leia Ano.
Idade = Ano – AnoNasc.
Imprima “Sua idade é: ” + Idade.
Fim
 */
import java.util.Scanner;
public class ExercicioLab01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano, nascimento, idade;
		
		System.out.print("Digite o ano de nascimento: ");
        nascimento = ler.nextInt();
        System.out.print("Digite o ano atual: ");
        ano = ler.nextInt();
        
        idade= ano - nascimento;
        System.out.print("A sua idade é: "+idade);
	}	

}
