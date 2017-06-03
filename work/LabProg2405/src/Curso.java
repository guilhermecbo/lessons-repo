import java.util.Scanner;

public class Curso {
	static final int tamanho = 10;
	static Aluno vAluno[] = new Aluno[tamanho];
	static Disciplina vDisciplina[] = new Disciplina[tamanho];
	static int indice = 0;
	static int indiceDisc = 0;

	public static void main(String[] args) {
		int op;

		do {
			System.out.println("Menu:\n");
			System.out.println("1 - Cadastra aluno");
			System.out.println("2 - Cadastra disciplina");
			System.out.println("3 - Matricula aluno");
			System.out.println("4 - Lista alunos");
			System.out.println("5 - Sair");

			op = new Scanner(System.in).nextInt();

			if (op == 1)
				cadastraAluno();
			if (op == 2)
				cadastraDisciplina();
			if (op == 3)
				matricula2();
			if (op == 4)
				listaAlunos();
			if (op == 5)
				System.exit(0);

		} while (true);

	}

	private static void listaAlunos() {
		for (int k = 0; k < indice; k++)
			System.out.print(vAluno[k]);
		// tindice++;

	}

	private static void matriculaAluno() {
		System.out.println("\n Alunos: ");
		for (int i = 0; i < indice; i++)
			System.out.println(i + "-[" + vAluno[i] + "]");
		System.out.println("Escolha um índice: ");
		int indA = new Scanner(System.in).nextInt();

		System.out.println("Disciplinas: ");
		for (int i = 0; i < indiceDisc; i++)
			System.out.println(i + "-[" + vDisciplina[i] + "]");
		System.out.println("Escolha um índice: ");
		int indD = new Scanner(System.in).nextInt();

		vAluno[indA].setDisciplina(vDisciplina[indD]);

	}

	private

	static void matricula2() {
		int i = 0;
		int auxAluno = 0;
		System.out.println("Digite o nome do aluno: ");
		String nome = new Scanner(System.in).nextLine();
		for (i = 0; i < indice; i++)
			if (vAluno[i].getNome().equals(nome)) {
				break;
			}
		System.out.println("------" + vAluno[i]);
	}

	private static void cadastraDisciplina() {
		System.out.println("Digite o nome da disciplina: ");
		String nomeDisc = new Scanner(System.in).nextLine();
		System.out.println("Digite a quantidade máxima de alunos: ");
		int maxAlunos = new Scanner(System.in).nextInt();
		System.out.println("Digite o código da disciplina: ");
		int codigo = new Scanner(System.in).nextInt();

		vDisciplina[indiceDisc] = new Disciplina();
		vDisciplina[indiceDisc].setNomeDisc(nomeDisc);
		vDisciplina[indiceDisc].setMaxAlunos(maxAlunos);
		vDisciplina[indiceDisc].setCodigo(codigo);
		indiceDisc++;

	}

	public static void cadastraAluno() {
		System.out.println("Digite o nome do aluno: ");
		String aluno = new Scanner(System.in).nextLine();
		System.out.println("Digite a matricula do aluno: ");
		String matricula = new Scanner(System.in).nextLine();

		vAluno[indice] = new Aluno();
		vAluno[indice].setNome(aluno);
		vAluno[indice].setMatricula(matricula);
		indice++;

	}

}
