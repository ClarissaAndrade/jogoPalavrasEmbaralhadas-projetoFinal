import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
		
	BancoDePalavras teste = new BancoDePalavras();
	FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
	FabricaMecanicaDoJogo fabricamecanica = new FabricaMecanicaDoJogo();
	
	
	System.out.println("Bem vindo ao jogo de palavras embaralhadas!");
	System.out.println("Será fornecida uma palavra embaralhada e você deve tentar descobrir qual é.");
	System.out.println("Qual o level deseja: (1 - Fácil ; 2 - Difícil) Digite apenas o número:");
	int level = sc.nextInt();
	
	MecanicaDoJogo mecanica = fabricamecanica.retornaMecanica(level);
	Embaralhador emb = fabrica.retornaEmbaralhador(level);
	
	/*System.out.println("Qual é a seguinte palavra: ");
	String palavra = teste.retornaPalavra();
	
	String reversa = emb.embaralhar(palavra);
	System.out.println(reversa);
	sc.nextLine();
	String resposta = sc.nextLine();
	
	mecanica.tentativa(reversa, resposta);
	mecanica.temVida(); */
	boolean terminou = false;
	sc.nextLine();
	
	while (terminou == false) {
	
		System.out.println("Qual é a seguinte palavra: ");
		String palavra = teste.retornaPalavra();
		String reversa = emb.embaralhar(palavra);
		System.out.println(reversa);
		
		String resposta = sc.nextLine();
		
		String tentativas = mecanica.tentativa(palavra, resposta);
		System.out.println(tentativas);
		mecanica.temVida();
		terminou = mecanica.terminou();		
	}
		
	System.out.println("O Jogo acabou!");
	System.out.println(mecanica.resultadoFinal());
	
	sc.close();

	}

	}


