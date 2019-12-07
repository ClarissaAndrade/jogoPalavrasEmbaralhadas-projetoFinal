
public class MecanicaUm implements MecanicaDoJogo {
	
	
	private int pontuacao = 0;
	private int level;
	private int vida = 5;
	private boolean vivo;
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String tentativa (String palavra, String resposta) {	

		if (palavra.equals(resposta)) {
			pontuacao += 10;
			return "Acertou, parabéns!";
		}
		
		else {
			pontuacao -= 5;
			vida--;
			return "Errou!";
		}
	}
		
	public void temVida () {
		
		if (vida != 0) {
			vivo = true;
		}
		else {
			vivo = false;
		}
	}
	
	public boolean terminou() {
		if (vivo == true) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String resultadoFinal () {
		return "Total de pontos: " + pontuacao;
	}
	
	

}
