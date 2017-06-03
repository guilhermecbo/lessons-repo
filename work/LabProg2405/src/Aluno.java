
public class Aluno {
	private String nome;
	private String matricula;
	private Disciplina disciplina;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString() {
		return "Aluno:\n"+
				" Nome: " + nome + 
				"\n Matricula: " + matricula + 
				"\n Disciplina: " + disciplina +
				"\n\n";
	}

}
