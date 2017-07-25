package qa;

import java.util.HashMap;

public class Sieve {
	

	public Sieve() {
		super();
	} 
	
	public HashMap<Character,Integer> sor(HashMap<Character,Integer>H,String s){
		for(int i = 0; i < s.length(); i++){
			   char c = s.charAt(i);
			   Integer val = H.get(new Character(c));
			   if(val != null){
			     H.put(c, new Integer(val + 1));
			   }else{
			     H.put(c,1);
			   }
			}
		
		return H;
	}

}