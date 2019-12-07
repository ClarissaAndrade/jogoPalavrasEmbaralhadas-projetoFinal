import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
		
	BancoDePalavras teste = new BancoDePalavras();
	String palavra = teste.retornaPalavra();
	System.out.println(palavra);
	
	
	FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
	Embaralhador emb = fabrica.retornaEmbaralhador(2);
	String reversa = emb.embaralhar(palavra);
	System.out.println(reversa);

	}

	}


