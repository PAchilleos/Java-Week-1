package JavaSE.Battleships;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public interface Place {
	
	public default ArrayList<Point>  pl(ArrayList<Point> c,Ship sh, int gridsize, ArrayList<Integer> a) {
		while (a.size()<sh.getCounters()) {
			a.clear();
			System.out.println("Please add the "+ sh.getName()+": size of "+sh.getCounters());
			Scanner s = new Scanner(System.in);           
	        System.out.println ("Enter x coordintate of ship :"); 
	        int x = s.nextInt();
	        System.out.println ("Enter y coordinate of ship :");
	        int y = s.nextInt();
	        System.out.println("Enter Orientation [Vertical (v) or Horizontal(h)]: ");
	        String O = s.next();
	       //String O = "Vertical";
	        c = sh.place(x, y, O);
			
			
			for (Point p: c) {
				if (p.x>gridsize || p.y>gridsize|| p.x<0||p.y<0) {
					
				}
				else {					
					a.add(1);					
				}			
				
			}	
			if (a.size()<sh.getCounters()) {
				System.out.println("Out of Grid try again: ");
				
			}
			
			
		}
		System.out.println("All Good!!");
		return c;
		
	}

}
