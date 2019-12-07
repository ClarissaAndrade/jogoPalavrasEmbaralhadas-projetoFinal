
public class FabricaEmbaralhadores {

	
	public Embaralhador retornaEmbaralhador (int level) {
		
		
		if (level == 1) {
			
			return new EmbaralhaUm();
		}
		else {
			return new EmbaralhaDois();
		}
		
		
	}
	
	
	
}
