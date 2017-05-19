import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Caixa c1 = objCaixa();
		Caneta can1 = objCaneta();
		menuInicial(c1, can1);
		//mostraCaixa(c1);
		//abreCaixa(c1);
		//mostraCaixa(c1);
		//fechaCaixa(c1);
		//mostraCaixa(c1);
		//mudaAltura(c1);
		//mudaLargura(c1);
		//mudaComp(c1);
		//mudaTampa(c1);
		//mostraCaixa(c1);
	}//------------------------------------------------------------
	
	public static void mostraCaixa(Caixa c, Caneta can){
		System.out.println("\n--------------------------"
							+ "\nCaixa:"
							+"\n--------------------------"
							+ c +can);
	}//------------------------------------------------------------
	
	public static void abreCaixa(Caixa c){
		c.setTampa(true);
	}//------------------------------------------------------------
	
	public static void fechaCaixa(Caixa c){
		c.setTampa(false);
	}//------------------------------------------------------------
	
	private static Caixa objCaixa(){
		Caixa c = new Caixa();
		return c;
	}//------------------------------------------------------------
	
	private static Caneta objCaneta(){
		Caneta can = new Caneta();
		return can;
	}//------------------------------------------------------------
	
	public static void menuInicial(Caixa c1, Caneta can1){
		Scanner ler = new Scanner(System.in);
		int op = 0;
		do {
			System.out.print("Digite a opção a seguir:"
						+ "\n 1 - Definir a altura da caixa"
						+ "\n 2 - Definir a largura da caixa"
						+ "\n 3 - Definir o comprimento da caixa"
						+ "\n 4 - Abrir ou fechar a tampa da caixa"
						+ "\n 5 - Definir o tamanho da Caneta"
						+ "\n 6 - Definir o diâmetro da Caneta"
						+ "\n 7 - Colocar a caneta na caixa "
						+ "\n 8 - Retirar a caneta na caixa"
						+ "\n 9 - Mostrar caixa"
						+ "\n 10 - Sair"
						+ "\n Digite a opção: "
						);
		op = ler.nextInt();
		
			switch (op) {
		
		case 1:
			mudaAltura(c1);
			break;
		case 2:
			mudaLargura(c1);
			break;
		case 3:
			mudaComp(c1);
			break;
		case 4:
			mudaTampa(c1, can1);
			break;
		case 5:
			mudaTamCaneta(can1);
			break;
		case 6:
			mudaDiamCaneta(can1);
			break;
		case 7:
			colocaCaneta(c1, can1);
			break;
		case 8:
			retiraCaneta(can1);
			break;
		case 9:
			mostraCaixa(c1, can1);
			break;
		
		} } while (op != 10);
			
	}//------------------------------------------------------------
	
	public static void mudaAltura(Caixa c){
		Scanner ler = new Scanner(System.in);
		double novaAlt;
		do{
			System.out.print("Digite a nova altura [1 - 30]: ");
			novaAlt = ler.nextDouble();
			if (novaAlt < 1 || novaAlt > 30){
				System.out.println("Valor incorreto! Favor digite um valor válido!");
			}
		}while (novaAlt < 1 || novaAlt > 30);
		c.setAltura(novaAlt);
	}//------------------------------------------------------------
	
	public static void mudaLargura(Caixa c){
		Scanner ler = new Scanner(System.in);
		double novaLarg;
		do{
			System.out.print("Digite a nova largura [1 - 30]: ");
		
			novaLarg = ler.nextDouble();
			if (novaLarg < 1 || novaLarg > 30){
				System.out.println("Valor incorreto! Favor digite um valor válido!");
			}
		}while (novaLarg < 1 || novaLarg > 30);
		c.setLargura(novaLarg);
	}//------------------------------------------------------------
	
	public static void mudaComp(Caixa c){
		Scanner ler = new Scanner(System.in);
		double novoComp;
		do{
			System.out.print("Digite o novo comprimento [1 - 30]: ");
			novoComp = ler.nextDouble();
			c.setComprimento(novoComp);
			if (novoComp < 1 || novoComp > 30){
				System.out.println("Valor incorreto! Favor digite um valor válido!");
			}
		}while (novoComp < 1 || novoComp > 30);
		
	}//------------------------------------------------------------
	
	public static void mudaTampa(Caixa c, Caneta can){
		Scanner ler = new Scanner(System.in);
		char opTampa;
		

		do{
			System.out.print("Deseja abrir ou fechar a tampa? [A/F]: ");
			opTampa = ler.next().charAt(0);
			if (opTampa != 'a' && opTampa != 'A' && opTampa != 'f' && opTampa != 'F'){
				System.out.println("'"+opTampa+"'"+" é um valor incorreto! Favor digite um valor válido!");
			}
		}while (opTampa != 'a' && opTampa != 'A' && opTampa != 'f' && opTampa != 'F');

			
			if (opTampa == 'a' || opTampa == 'A' )
				c.setTampa(true);
			if (opTampa == 'f' || opTampa == 'F')
				c.setTampa(false);
			if (can.chkCaixa == false){
				System.out.println("A caixa está vazia!");
			}
	}//------------------------------------------------------------
	
	public static void mudaTamCaneta(Caneta can){
		Scanner ler = new Scanner(System.in);
		double novoTam;
		do{
			System.out.print("Digite o novo tamanho da caneta [1 - 15]: ");
			novoTam = ler.nextDouble();
			can.setTamanho(novoTam);
			if (novoTam < 1 || novoTam > 15){
				System.out.println("Valor incorreto! Favor digite um valor válido!");
			}
		}while (novoTam < 1 || novoTam > 15);
		
	}//------------------------------------------------------------
	
	public static void mudaDiamCaneta(Caneta can){
		Scanner ler = new Scanner(System.in);
		double novoDiam;
		do{
			System.out.print("Digite o novo diâmetro da caneta [1 - 5]: ");
			novoDiam = ler.nextDouble();
			can.setDiametro(novoDiam);
			if (novoDiam < 1 || novoDiam > 5){
				System.out.println("Valor incorreto! Favor digite um valor válido!");
			}
		}while (novoDiam < 1 || novoDiam > 5);
		
	}//------------------------------------------------------------
	
	public static void colocaCaneta(Caixa c, Caneta can){
		//Scanner ler = new Scanner(System.in);
		//char colCaneta;
		if (c.tampa == false){
			Scanner ler = new Scanner(System.in);
			char abreCx;
			do{
				System.out.println("A caixa está fechada. Deseja abrir a caixa?");
				abreCx = ler.next().charAt(0);
			}while ( abreCx != 'a' && abreCx != 'A');
			if ( abreCx == 'a' || abreCx == 'A'){
				c.tampa = true;
			}
			
			
		}if (c.tampa == true){
			can.chkCaixa = true;
			System.out.println("A tamba foi aberta, e a caneta foi colocada dentro da caixa.");
		}

	}//------------------------------------------------------------
	
	public static void retiraCaneta(Caneta can){


		if (can.chkCaixa == false){
			System.out.println("A caixa está vazia.");
		} if (can.chkCaixa == true){
			System.out.println("A caneta foi retirada da caixa.");
			can.chkCaixa = false;
		} 

		/*do{
			System.out.print("Deseja colocar ou tirar a caneta da caixa? [C/T]: ");
			colCaneta = ler.next().charAt(0);
			if (colCaneta != 'c' && colCaneta != 'C'){
				System.out.println("'"+colCaneta+"'"+" é um valor incorreto! Favor digite um valor válido!");
			}
		}while (colCaneta != 'c' && colCaneta != 'C');
		*/

	}//------------------------------------------------------------
}
