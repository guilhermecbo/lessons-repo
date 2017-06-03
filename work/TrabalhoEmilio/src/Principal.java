
import java.util.Scanner;

public class Principal {
	static final int tamanho = 10;
	static int indice = 0;
	static Estatistica[] vNome = new Estatistica[tamanho];
	static Estatistica[] vIdade = new Estatistica[tamanho];
	static Estatistica[] vSexo = new Estatistica[tamanho];
	static int mulheres = 0;
	static int homens = 0;

	public static void main(String[] args) {
		int op;

		do {
			System.out.println("Menu -------------");
			System.out.println("1 - Cadastra pessoa");
			System.out.println("2 - Lista pessoas");
			System.out.println("3 - Mostrar homem e mulher mais novos");
			System.out.println("4 - Comparar idades");
			System.out.println("5 - Percentual de homens e mulheres");
			System.out.println("6 - Sair");

			op = new Scanner(System.in).nextInt();

			if (op == 1)
				cadastraPessoa();
			if (op == 2)
				listaPessoas();
			if (op == 3)
				mostraNovos();
			if (op == 4)
				comparaIdades();
			if (op == 5)
				calculaPercentual();
			if (op == 6)
				System.exit(0);
		} while (true);
	}

	private static void listaPessoas() {
		System.out.println("Pessoas cadastradas:");
		for (int k = 0; k < indice; k++) {
			System.out.println(" Nome: " + vNome[k].getNome());
			System.out.println(" Idade: " + vIdade[k].getIdade());
			System.out.println(" Sexo: " + vSexo[k].getSexo() + "\n");
		}
	}

	private static void comparaIdades() {
		int dif = 0;
		System.out.println("Teste comp idade");
		System.out.println("\n Pessoas cadastradas: ");
		for (int i = 0; i < indice; i++)
			System.out.println(i + "-[" + vNome[i].getNome() + "]");
		System.out.println("Escolha o índice da pessoa A: ");
		int indA = new Scanner(System.in).nextInt();
		System.out.println("Escolha o índice da pessoa B: ");
		int indB = new Scanner(System.in).nextInt();
		
		int pessoaA = vIdade[indA].getIdade();
		String nomeA = vNome[indA].getNome();
		int pessoaB = vIdade[indB].getIdade();
		String nomeB = vNome[indB].getNome();
		
		if (pessoaA < pessoaB){
			dif = pessoaB - pessoaA;
			System.out.println("A idade de "+nomeA+" é menor que a idade de "+nomeB+". A diferença de idade é de "+dif+" anos.");
		}else{
			dif = pessoaA - pessoaB;
			System.out.println("A idade de "+nomeA+" é maior que a idade de "+nomeB+". A diferença de idade é de "+dif+" anos.");
		}

	}

	private static void mostraNovos() {

	}

	public static void cadastraPessoa() {
		System.out.println("Digite o nome: ");
		String nome = new Scanner(System.in).nextLine();
		System.out.println("Digite a idade: ");
		int idade = new Scanner(System.in).nextInt();
		System.out.println("Informe o sexo: ");
		String sexo = new Scanner(System.in).nextLine();
		vNome[indice] = new Estatistica();
		vNome[indice].setNome(nome);
		vIdade[indice] = new Estatistica();
		vIdade[indice].setIdade(idade);
		vSexo[indice] = new Estatistica();
		vSexo[indice].setSexo(sexo);
		indice++;
	}

	public static void calculaPercentual() {
		for (int k = 0; k < indice; k++) {
			String s = vSexo[k].getSexo();
			System.out.println(s);
			if (s == "M" || s == "m") 
				homens++;
			if (s == "F" || s == "f") 
				mulheres++;
		}
		int porcentHomens = (100*homens)/indice;
		int porcentMulheres = (100*mulheres)/indice;
		System.out.println("A porcentagem de homens é de " + porcentHomens + "%\nA porcentagem de mulheres é de "
				+ porcentMulheres + "%");
	}

}
