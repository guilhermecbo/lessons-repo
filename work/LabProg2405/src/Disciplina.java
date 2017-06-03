
public class Disciplina {
	private String nomeDisc;
	private int maxAlunos;
	private int codigo;
	
	
	public String getNomeDisc() {
		return nomeDisc;
	}
	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}
	public int getMaxAlunos() {
		return maxAlunos;
	}
	public void setMaxAlunos(int maxAlunos) {
		this.maxAlunos = maxAlunos;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String toString() {
		return "Disciplina:"+
				"\n Nome: " + nomeDisc + 
				" Máximo de alunos: " + maxAlunos + 
				" Codigo: " + codigo + 
				"\n\n";
	}
	
}
