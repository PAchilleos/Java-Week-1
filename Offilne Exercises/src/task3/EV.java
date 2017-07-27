package task3;

import java.util.ArrayList;
import java.util.Collections;

public class EV {
	
	public boolean evsp(int a, int b, int c) {
		ArrayList<Integer> A = new ArrayList<Integer>(); 
		A.add(a);
		A.add(b);
		A.add(c);
		
		int max = 0;
		int max2 =0;
		
		int x1 = Collections.max(A);
		System.out.println(x1);
		
		
		for (int i =0; i<A.size();i++) {
			if (x1 == A.get(i)) {
				max=A.get(i);
				A.remove(A.get(i));				
			}
		}
		
		if (A.size() == 2) {
			int x2 = Collections.max(A);
			
			for (int i =0; i<A.size();i++) {
				if (x2 == A.get(i)) {
					max2=A.get(i);
					A.remove(A.get(i));				
				}
			}
			
			if (A.size() == 1) {
				if ((max-max2)== max2-A.get(0)) {
					return true;
				}
				else {
					return false;
				}
			}
			else 
				return false;
			
			
		}
		else if (A.size() == 1) {
			if (A.get(0)==max) {				
			return true;
		}
			else {
				return false;
						}
		}
		return true;
	}

}
