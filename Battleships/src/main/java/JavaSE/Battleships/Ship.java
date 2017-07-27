package JavaSE.Battleships;

import java.awt.Point;
import java.util.ArrayList;

public class Ship {		
	private String Name;
	private int counters;
	private int hits;
	private boolean isHit;
	
	public Ship(String name, int counters) {
		super();
		Name = name;
		this.counters = counters;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getCounters() {
		return counters;
	}

	public void setCounters(int counters) {
		this.counters = counters;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public boolean isHit() {
		return isHit;
	}

	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}
	
	
	
	public ArrayList<Point> place(int x, int y, String or) {  //places the ship by creating counters x and y are the coordinates of the start position of the ship
		Point l1=  new Point(x,y);
		ArrayList<Point> c = new  ArrayList<Point>(); //array list of counter start and end points  //make it include all counters in between
		c.add(l1);
		if(or.equals("v")) {
			for (int i=1;i<counters;i++) {		
				Point l2 = new Point(x, y-i);				
				c.add(l2);	
			}
		}
		else if (or.equals("h")) {
			for (int i=1;i<counters;i++) {	
				Point l2 = new Point(x+i,y);
				c.add(l2);
			}
		}
		return c; //c IS AN ARRAYLIST OF COUNTERS THAT DEFINE WHERE THE SHIP CAN BE HIT!!
	}
	// need to implement a method where ships can't overlap, i.e. two counters can't have the same coordinates!!!
	

}
