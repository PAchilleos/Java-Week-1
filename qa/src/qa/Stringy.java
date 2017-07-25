package qa;

import java.util.HashMap;

public class Stringy {
	public static void main(String[] args) {
		
		String a = "hello";
		String b = "telephone";		
		Sieve S= new Sieve();
		
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();      
		HashMap<Character,Integer> map2= new HashMap<Character,Integer>();          
		
		S.sor(map1, a);
		S.sor(map2,b);
		
		
		System.out.println(map1.get('l'));
		System.out.println(map2.get('e'));
		
		
	}

}