
public class Lampada {
	public boolean estado; // false = apagada. true = ligada.
	String cor;
	
	public Lampada(String cor){
		setCor(cor);
	}
	
	public String getCor(){
		return cor;
	}
	
	private void setCor(String cor){
		this.cor = cor;
	}
	
	public void alteraEstado(){
		estado = !estado;
	}
		
	public void alteraCor(String c){
		cor = c;
	}
	
	/*public String mostraEstado(){
		if(estado)
			return "Ligada";
		return "Desligada";
	}*/
	
	public String mostraLampada(){
		if (estado)
			return cor+" Ligada";
		return cor+" Desligada";
	}
	
	public String mostraCor(){
		return cor;
	}
}
