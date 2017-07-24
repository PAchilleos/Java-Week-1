package qa;

import java.util.ArrayList;
import java.util.Collections;

public class PaintTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paint p1= new Paint("CheapoMax",20,19.99,10);
		Paint p2= new Paint("AverageJoes",15,17.99,11);
		Paint p3= new Paint("DuluxourousPaints",10,25,20);
				
		double room=1000; //room size in m^2
		
		Paint[] p={p1,p2,p3};
		
		ArrayList<Integer> m = new ArrayList<Integer>();
		
		for(int i=0; i<p.length; i++){
			m.add(p[i].metcov());
			System.out.println(p[i].name+" covers "+m.get(i)+ " m^2 per tin at a price of £"+p[i].price);
			System.out.println(p[i].name+ "comes in tins of "+p[i].litres+" litres");
			System.out.println("");
		}
		
		
		
		ArrayList<Float> c = new ArrayList<Float>();
		ArrayList<Integer> na = new ArrayList<Integer>();
		
		for (int i=0; i<m.size(); i++){
			na.add((int) Math.ceil(room/(m.get(i))));
			int n =(int) Math.ceil(room/(m.get(i)));
			c.add((float) (n*p[i].price));
			
		}
				
		float min= (float) Collections.min(c);				
		int index=c.indexOf(min);
		
		System.out.println("It is cheapest to buy "+ na.get(index)+ " tin(s) of " +p[index].name+" for a total price of £" +min +" to cover a room of size "+ room+ " m^2");
		
		
		}	
			
			
			
			
		
			
		
		
		
		
}


