package JavaSE.Battleships;

import java.awt.Point;
import java.util.ArrayList;

public class Stage2 {
	public static void main(String[] args) {
		RN R = new RN();
		int gridsize = 10;
		Grid g = new Grid(gridsize,gridsize); //creates Grid
		Ship sub = new Ship("Submarine", 3); //creates ship
		Ship des = new Ship("Destroyer", 4);
		ArrayList<Ship> S = new ArrayList<Ship>(); //creates array list of ships
		g.setS(S);  // places array list on the grid
		
		
		
		
		ArrayList<Integer> a =new ArrayList<Integer>();
		
		
		ArrayList<Point> c= new ArrayList<Point>();
		ArrayList<Point> sub_points = R.pl(c,sub, gridsize, a);	
		System.out.println(sub_points);
		System.out.println("");
		g.addship(sub); // adds ship to array
		ArrayList<Point> des_points = R.pl(c,des, gridsize, a);	
		System.out.println(des_points);
		
		
		
		
		g.addship(des);
		
		
		
		// need to implement a method where ships can't overlap, i.e. two counters can't have the same coordinates!!!
		
		
		

		
	}

}
