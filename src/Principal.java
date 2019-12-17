import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		BancoDePalavras bancoDePalavras = new BancoDePalavras();
		FabricaEmbaralhadores fabricaEmbaralhador = new FabricaEmbaralhadores();
		FabricaMecanicaDoJogo fabricaMecanica = new FabricaMecanicaDoJogo();
	
	
		System.out.println("Bem vindo ao jogo de palavras embaralhadas!");
		System.out.println("Será fornecida uma palavra embaralhada e você deve tentar descobrir qual é.");
		System.out.println("Qual o level deseja: (1 - Fácil ; 2 - Difícil) Digite apenas o número:");
		int level = scanner.nextInt();
	
		MecanicaDoJogo mecanica = fabricaMecanica.retornaMecanica(level);
		Embaralhador embaralhador = fabricaEmbaralhador.retornaEmbaralhador(level);
	
		boolean jogoTerminou = false;
		scanner.nextLine();
	
		while (jogoTerminou == false) {
	
			System.out.println("Qual é a seguinte palavra: ");
			String palavra = bancoDePalavras.retornaPalavra();
			String reversa = embaralhador.embaralhar(palavra);
			System.out.println(reversa);
		
			String resposta = scanner.nextLine();
		
			String tentativas = mecanica.tentativa(palavra, resposta);
			System.out.println(tentativas);
			mecanica.temVida();
			jogoTerminou = mecanica.terminou();		
		}
		
		System.out.println("O Jogo acabou!");
		System.out.println(mecanica.resultadoFinal());
	
		scanner.close();

	}
}


