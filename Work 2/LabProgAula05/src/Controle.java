
public class Controle {

	public static void main(String[] args) {
		// Cria objeto chamado lamp, da classe Lâmpada. Chama o método construtor Lampada().
		Lampada lamp = new Lampada("Branca"); 
		Lampada lamp2 = new Lampada("Azul"); 
		
		//System.out.println(lamp.mostraLampada());
		

		lamp.alteraEstado();
		System.out.println(lamp.mostraLampada());
		
		lamp.alteraCor("Amarela");
		System.out.println(lamp.mostraLampada());
		
		lamp2.alteraEstado();
		System.out.println(lamp2.mostraLampada());
		
		lamp2.alteraCor("Azul");
		System.out.println(lamp.mostraLampada());
		
		if (lamp == lamp2)
			System.out.println("São iguais");
			else System.out.println("Não são iguais");
		

	}

}
