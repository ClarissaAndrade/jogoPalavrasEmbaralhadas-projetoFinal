import java.util.Random;

public class EmbaralhaDois implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		
		Random random = new Random();
		
		char s[] = palavra.toCharArray();
		
		int n = s.length; 
		  for (int i = 0; i < n; i++) {
		    int t = random.nextInt(n); 
		    if (t == i) {              
		      if (i > 0) {             
		        t = random.nextInt(i); 
		      } else {
		        t = s.length - 1;      
		      }
		    }
		    s[i] ^= s[t];           
		    s[t] ^= s[i];
		    s[i] ^= s[t];
		  }
		  
		  palavra = String.copyValueOf(s);
		  return palavra;
	}

}
