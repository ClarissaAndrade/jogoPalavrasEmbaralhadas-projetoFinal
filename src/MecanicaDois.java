
public class MecanicaDois implements MecanicaDoJogo {

	private int pontuacao = 0;
	private int level;
	private int vida = 3;
	private boolean vivo;
	
	@Override
	public String tentativa (String palavra, String resposta) {	

		if (palavra.equals(resposta)) {
			pontuacao += 10;
			return "Acertou, parabéns!";
		}
		
		else {
			pontuacao -= 8;
			vida--;
			return "Errou!";
		}
	}
	
	@Override	
	public void temVida () {
		
		if (vida != 0) {
			vivo = true;
		}
		else {
			vivo = false;
		}
	}
	
	@Override
	public boolean terminou() {
		if (vivo == true) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public String resultadoFinal () {
		return "Total de pontos: " + pontuacao;
	}
}
