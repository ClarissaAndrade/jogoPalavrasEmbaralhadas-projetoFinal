import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
		
	BancoDePalavras teste = new BancoDePalavras();
	String palavra = teste.retornaPalavra();
	System.out.println(palavra);
	
	
	
	Embaralhador emb = new EmbaralhaDois();
	String reversa = emb.embaralhar(palavra);
	System.out.println(reversa);

	}

	}


