package JavaSE.Battleships;

import java.awt.Point;
import java.util.ArrayList;

public class Stage1 {
	public static void main(String[] args) {
		RN R = new RN();
		int gridsize = 10;
		Grid g = new Grid(gridsize,gridsize); //creates Grid
		Ship sub = new Ship("Submarine", 3); //creates ship
		ArrayList<Ship> S = new ArrayList<Ship>(); //creates array list of ships
		g.setS(S);  // places array list on the grid
		g.addship(sub); // adds ship to array
		
		
		
		ArrayList<Integer> a =new ArrayList<Integer>();
		
		
		ArrayList<Point> c= new ArrayList<Point>();
		System.out.println(R.pl(c,sub, gridsize, a));		
		
		
		
		
		
		

		
	}

}
