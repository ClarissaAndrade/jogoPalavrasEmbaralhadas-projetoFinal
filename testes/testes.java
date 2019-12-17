import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testes {

	@Test
	void embaralhamentoUm() {
		
		String palavraTeste = "palavra";
		FabricaEmbaralhadores fabricaEmbaralhador = new FabricaEmbaralhadores();
		Embaralhador emb = fabricaEmbaralhador.retornaEmbaralhador(1);
		String palavraReversa = emb.embaralhar(palavraTeste);
		assertEquals("arvalap", palavraReversa);
	}
	

	@Test
	void embaralhamentoDois() {
		
		String palavraTeste = "palavra";
		FabricaEmbaralhadores fabricaEmbaralhador = new FabricaEmbaralhadores();
		Embaralhador emb = fabricaEmbaralhador.retornaEmbaralhador(2);
		String palavraReversa = emb.embaralhar(palavraTeste);
		assertNotEquals("palavra", palavraReversa);
	}

}
