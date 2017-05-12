
public class Caixa {
	private double altura;
	private double largura;
	private double comprimento;
	boolean tampa;
	

	public Caixa() {
		double alt = 0;
		double larg = 0;
		double comp = 0;
		tampa = false;
		setAltura(alt);
		setLargura(larg);
		setComprimento(comp);
	}//------------------------------------------------------------

	public double getAltura(){
		return altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}//------------------------------------------------------------
	
	public double getLargura(){
		return largura;
	}
	
	public void setLargura(double largura){
		this.largura = largura;
	}//------------------------------------------------------------
	
	public double getComprimento(){
		return comprimento;
	}
	
	public void setComprimento(double comprimento){
		this.comprimento = comprimento;
	}//------------------------------------------------------------
	
	public boolean getTampa(){
		return tampa;
	}
	
	public void setTampa(boolean tampa){
		this.tampa = tampa;
	}//------------------------------------------------------------
	
	public String toString(){
		return "\n altura: "+getAltura()+
				"\n largura "+getLargura()+
				"\n comprimento "+getComprimento()+
				"\n tampa: "+tampa();
	}//------------------------------------------------------------

	private String tampa() {
		if (getTampa())
			return " Aberta.";
		return " Fechada. ";
	}//------------------------------------------------------------
}
