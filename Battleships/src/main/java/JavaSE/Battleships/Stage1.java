package JavaSE.Battleships;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Stage1 {
	public static void main(String[] args) {
		int gridsize = 10;
		Grid g = new Grid(gridsize,gridsize); //creates Grid
		Ship sub = new Ship("Submarine", 3); //creates ship
		ArrayList<Ship> S = new ArrayList<Ship>(); //creates array list of ships
		g.setS(S);  // places array list on the grid
		g.addship(sub); // adds ship to array
		
		
		Scanner s = new Scanner(System.in);           
        System.out.println ("Enter x coordintate of ship :"); 
        int x = s.nextInt();
        System.out.println ("Enter y coordinate of ship :");
        int y = s.nextInt();
		ArrayList<Point> c = sub.place(x, y, "Vertical"); //places ship on the grid and creates counters that will act as hit boxes
		//stores counters' coordinates in an array list
		s.close();
		//System.out.println(c);
		
		/**for (Point p: c) {
			while (p.x>gridsize || p.y>gridsize|| p.x<0||p.y<0)
				//System.out.println(p.x +" "+p.y);
				System.out.println("Out of Grid Try again : ");
				s = new Scanner(System.in);  
					
			    System.out.println ("Enter x coordintate of ship :"); 
		        x = s.nextInt();
		        System.out.println ("Enter y coordinate of ship :");
		        y = s.nextInt();
				c = sub.place(x, y, "Vertical");
				s.close();
		}**/
		
		
		// need to implement a method where ships can't overlap, i.e. two counters can't have the same coordinates!!!
		// need to implement a method so that the ship coordinates can't be out of range of the grid (in this case 10x10)

		
	}

}
