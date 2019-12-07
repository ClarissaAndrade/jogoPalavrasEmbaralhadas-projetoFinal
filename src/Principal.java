import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
		
	BancoDePalavras teste = new BancoDePalavras();
	FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
	FabricaMecanicaDoJogo fabricamecanica = new FabricaMecanicaDoJogo();
	
	
	System.out.println("Bem vindo ao jogo de palavras embaralhadas!");
	System.out.println("Ser� fornecida uma palavra embaralhada e voc� deve tentar descobrir qual �.");
	System.out.println("Qual o level deseja: (1 - F�cil ; 2 - Dif�cil) Digite apenas o n�mero:");
	int level = sc.nextInt();
	
	MecanicaDoJogo mecanica = fabricamecanica.retornaMecanica(level);
	
	System.out.println("Qual � a seguinte palavra: ");
	String palavra = teste.retornaPalavra();
	Embaralhador emb = fabrica.retornaEmbaralhador(level);
	String reversa = emb.embaralhar(palavra);
	
	String resposta = sc.nextLine();
	
	mecanica.tentativa();
	
	
	sc.close();

	}

	}


