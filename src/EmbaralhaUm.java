
public class EmbaralhaUm implements Embaralhador{

	@Override
	public String embaralhar(String palavra) {
		
			    int len = palavra.length();
			    char[] tempCharArray = new char[len];
			    char[] charArray = new char[len];
			 
			    for (int i = 0; i < len; i++) {
			      tempCharArray[i] = palavra.charAt(i);
			    }
			 
			    for (int j = 0; j < len; j++) {
			      charArray[j] = tempCharArray[len - 1 - j];
			    }
			 
			    String reversa = new String(charArray);
			    return reversa;
	}	
}
	
	
	

