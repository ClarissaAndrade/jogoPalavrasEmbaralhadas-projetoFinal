
public class FabricaMecanicaDoJogo {

	public MecanicaDoJogo retornaMecanica (int level) {
		
		
		if (level == 1) {
			
			return new MecanicaUm();
		}
		else {
			return new MecanicaDois();
		}
		
		
	}
	
	
	
	
	
}
