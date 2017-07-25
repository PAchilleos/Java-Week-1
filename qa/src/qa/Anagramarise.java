package qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Anagramarise {
	HashMap<String, ArrayList<String>> H = new HashMap<String, ArrayList<String>>();	
	
	ArrayList<String> K = new ArrayList<String>();  // set parameters
	int max;
	
	int ws; //set original value for word size
	ArrayList<String> W = new ArrayList<String>();
	
	

	public Anagramarise(HashMap<String, ArrayList<String>> h, ArrayList<String> k, int max, int ws,
			ArrayList<String> w) {
		super();
		H = h;
		K = k;
		this.max = max;
		this.ws = ws;
		W = w;
	}


	public HashMap<String, ArrayList<String>> ana(ArrayList<String> A){  // sorts words that contain the same letters  
		
		for (int i=0;i<A.size();i++) {
			String x = A.get(i);
			char[] chars = x.replaceAll("\\s+", "").toLowerCase().toCharArray();
			Arrays.sort(chars);	
			String c = String.valueOf(chars);			
			if (H.containsKey(c)) {						
				H.get(c).add(x);
			}
			else {
				ArrayList<String> b = new ArrayList<String>();
				b.add(x);				
				H.put(c,b);				
			}
			
		}		
		return H;
	}
	
	
	public int findkey(HashMap<String, ArrayList<String>> H){
		Iterator<Entry<String, ArrayList<String>>> it = H.entrySet().iterator();	
		
		while (it.hasNext()) {
			Entry<String, ArrayList<String>> entry = it.next();
			//System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
			//System.out.println(entry.getValue().size());
			//System.out.println("");
			
			if (entry.getValue().size()>max) {
				max = entry.getValue().size(); //changes max value to the new max value
				
				K.clear();
				K.add(entry.getKey()); //clear array list and add new max value
			}
			else if (entry.getValue().size()==max) {
				K.add(entry.getKey());  // add joint max value to array list
			}
			it.remove();
		}
		
		
		return max;
	}
	
	public void findval(){
		for (int i =0; i<K.size();i++) {
			if (K.get(i).length()>ws) {
				ws = K.get(i).length();
				W.clear();
				W.add(K.get(i));			
			}
			else if (K.get(i).length()==ws) {
				W.add(K.get(i));
			}
			
		}
			
	}

}
