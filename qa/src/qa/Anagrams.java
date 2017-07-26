package qa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> w=new ArrayList<String>(); //initial array list to store all words
		HashMap<String, ArrayList<String>> map = new HashMap<>();  //hash maps to store anagrams
		ArrayList<String> K = new ArrayList<String>();  // set parameters
		int max = 0;	
		int ws = 0; //set original value for word size
		ArrayList<String> W = new ArrayList<String>();		
		
		Anagramarise H = new Anagramarise(map,K,max,ws,W); // create anagram class from hashmap;		
		
		long startTime = System.currentTimeMillis();
		try {
			Scanner s1 = new Scanner(new File("C:\\Users\\Profile\\Desktop\\wordList.txt"));
			
			
			while (s1.hasNextLine()) {
				String[] si=s1.nextLine().split(", ");
				for (int i =0; i<si.length; i++) {
					if (!si[i].equals(""))
						w.add(si[i]);
					
					
				}
				
				
			}
			s1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		H.ana(w);  
		int x =H.findkey(map); // finds the amount of anagrams for each entry in the hashmap 
		H.findval();  // finds the longest word(s) with the most anagrams	
		
		System.out.println("The longest sorted word(s) with the most anagrams is " + W +" with " +x+" anagrams!");		
		final long endTime = System.currentTimeMillis();
        
        System.out.println("Total execution time: " + ((double)(endTime - startTime)/1000)+" seconds" );	
		
		
	}
	

}
