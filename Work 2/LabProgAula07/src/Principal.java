import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(teclado("Nome da pessoa: "));
		pessoa.setIdade(lerInt("Digite sua idade: "));		
		Cachorro cao = new Cachorro(teclado("Sexo: ").charAt(0));
		cao.setNome(teclado("Nome do c�o: "));
		cao.setCorPredominante(teclado("Cor Predominante: "));
		cao.setRaca(teclado("Ra�a: "));
		cao.setDtNascimento(teclado("Data nascimento: "));
		cao.setPorte(teclado("Porte [P/M/G]: ").charAt(0));		
		pessoa.setCao(cao);
		
		System.out.println(
							
							"\n------------- Dados do c�o --------------"+
							"\n Nome: "+cao.getNome()+
							"\n Sexo: "+cao.getSexo()+
						    "\n Cor predominante: "+cao.getcorPredominante()+
						    "\n Ra�a: "+cao.getRaca()+
						    "\n Data de Nascimento: "+cao.getRaca()+
						    "\n Porte: "+cao.getPorte()+
						    "\n--------------- Dados da Pessoa -----------"+
							"\n Nome: "+pessoa.getNome()+
							"\n idade "+pessoa.getIdade()+
						    "\n C�o: "+pessoa.getCao().getNome()
							);

	}

	public static String teclado(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem);
		return ler.nextLine();
	}
	
	public static int lerInt(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem);
		return ler.nextInt();
	}
}