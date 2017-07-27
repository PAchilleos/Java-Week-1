package JavaSE.Battleships;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

@SuppressWarnings("unused")
public class ShipTest {
	Ship test = new Ship("Submarine", 3);

	@Test
	public void testH() {
		int c=test.getCounters();
		ArrayList<Point>p = test.place(1,5,"h"); 
		System.out.println(p);
		assertEquals(p.get(0).y,p.get(c-1).y); //if horizontal y position of start and end coordinates should be the same 
		assertNotEquals(p.get(0).x,p.get(c-1).x); //x positions should be different
		assertEquals(p.get(0).x+(c-1),p.get(c-1).x); //specifically the end x position should be start x position + (counters-1) (size of ship) 
		
	}
	
	@Test
	public void testV() {
		int c=test.getCounters();
		ArrayList<Point>p = test.place(1,5,"v"); 
		System.out.println(p);
		assertEquals(c,p.size()); // check that number of counters created is equal to the number of counters specified in the Ship class
		assertEquals(p.get(0).x,p.get(c-1).x); //if vertical x position of start and end coordinates should be the same 
		assertNotEquals(p.get(0).y,p.get(c-1).y); //y positions should be different
		assertEquals(p.get(0).y-(c-1),p.get(c-1).y); //specifically the end y position should be start y position - (counters-1) 
		
	}

}
