import java.util.*;
public class Pessoa {
	private String		 nome;
	private int			idade;
	private Cachorro	  cao;
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setCao(Cachorro cao){
		this.cao = cao;
	}
	
	public Cachorro getCao(){
		return cao;
	}

}

/*
 * 
 * 
*/

/*
public class Cachorro{ 
	
	private String			   nome;
	private char			   sexo;
	private String		       raca;
	private String 	   dtNascimento;
	private char			  porte;
	private String 	corPredominante;
	
	public Cachorro(char sexo){
		this.sexo = sexo;
	}
	
	public char getSexo(){
		return sexo;
	}
	
 	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getRaca(){
		return raca;
	}
	
	public void setRaca(String raca){
		this.raca = raca;
	}
	
	public String getdtNascimento(){
		return dtNascimento;
	}
	
	public void setDtNascimento(String dtNascimento){
		this.dtNascimento = dtNascimento;
	}
	
	public char getPorte(){
		if (porte  == 'p')
			return "Pequeno";
		if (porte == 'm')
			return "Médio";
		if (porte == 'g')
			return "Grande";
		return porte;
	}
	
	public void setPorte(char porte){
		//if (porteCorreto)
			this.porte = porte;
	}
	
	public String getcorPredominante(){
		return corPredominante;
	}
	
	public void setCorPredominante(String corPredominante){
		this.corPredominante = corPredominante;
	}

	public boolean porteCorreto(){
		if (	porte == 'p' || porte == 'P' ||
				porte == 'm' || porte == 'M' ||
				porte == 'g' || porte == 'G' 
			)return true;
		return false;
			
	
}

*/

