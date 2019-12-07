import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
	
	private String caminho = "C:\\Users\\Clarissa\\eclipse-workspace\\ProjetoFinal\\bancodepalavras.txt";
	private List<String> lista = new ArrayList<>();
	
	
	public BancoDePalavras ( ) {
	}
 
    public String retornaPalavra() {
    	try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

    		String palavra = br.readLine();
    		while (palavra != null) {

    			lista.add(palavra);

    			palavra = br.readLine();
    		}
    	}

    	catch (IOException e) {
    		System.out.println("Error reading file: " + e.getMessage());
    	}
    	
    	Random gerador = new Random();
        int index = gerador.nextInt(lista.size());

        return lista.get(index);
    }
	
}


