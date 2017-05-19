
public class Caneta {
	private String cor;
	private double tamanho = 0;
	private double diametro = 0;
	boolean chkCaixa;
	
	public Caneta() {
		double tam = 0;
		double dia = 0;
		chkCaixa = false;
		setTamanho(tam);
		setDiametro(dia);
		
}

	public double getDiametro() {
		return diametro;
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public double getTamanho(){
		return tamanho;
	}
	
	public boolean getCanCaixa(){
		return chkCaixa;
	}
	
	public void setCanCaixa(boolean chkCaixa){
		this.chkCaixa = chkCaixa;
	}//------------------------------------------------------------
		
	public String chkCaixa(boolean b) {
		if (getCanCaixa())
			return " Dentro da caixa.";
		return " Fora da caixa. ";
	}
	
	public String toString(){
		return "\nCaneta:"
				+"\n diâmetro: "+getDiametro()
				+ "\n tamanho "+getTamanho()

				+ "\n Local: "+chkCaixa(chkCaixa);
	}//------------------------------------------------------------
}
