import java.util.Scanner;

/*
Exercicio01
Abra um projeto com o nome de ExemploAula06.
Crie uma classe Cachorro com os seguintes atributos:
nome (string)
raca (string)
dtNascimento(string)
porte(char) >> [P]equeno, [M]edio e [G]rande
corPredominante (String)


Para a classe 'Cachorro' crie os m�todos para atribuir dados ao nome,raca, 
dtNascimento, porte e corPredominante.
Crie tamb�m os m�todos para mostrar esses atributos individualmente.

Crie uma classe chamada 'Principal'. Nesta classe voc� dever� instanciar um 
objeto cao, preencher seus atributos e imprim�-los.
Fa�a isto para apenas um objeto cao.
*/

public class Principal {

	public static void main(String[] args) {
		Cachorro cao = new Cachorro(teclado("Sexo: ").charAt(0));
		cao.setNome(teclado("Nome: "));
		cao.setCorPredominante(teclado("Cor Predominante: "));
		cao.setRaca(teclado("Ra�a: "));
		cao.setDtNascimento(teclado("Data nascimento: "));
		cao.setPorte(teclado("Porte [P/M/G]: ").charAt(0));		
		
		System.out.println("\n------------- Dados do c�o --------------"+
						   "\n Nome: "+cao.getNome()+
						   "\n Sexo: "+cao.getSexo()+
						   "\n Cor predominante: "+cao.getcorPredominante()+
						   "\n Ra�a: "+cao.getRaca()+
						   "\n Data de Nascimento: "+cao.getRaca()+
						   "\n Porte: "+cao.getPorte());

	}

	public static String teclado(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem);
		return ler.nextLine();
	}
}
