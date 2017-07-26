package JavaSE.Battleships;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GridTest {
	
	Ship test = new Ship("Submarine", 3);
	Ship test2 = new Ship("Destroyer",4);
	Grid g = new Grid(3,3);
	ArrayList<Ship> S = new ArrayList<Ship>();
	

	@Test
	public void test() {
		g.setS(S); //adds array list to the grid
		g.addship(test); // adds ship to array list
		assertEquals(1,S.size()); // check if ship has been added
	}

	
	@Test
	public void test2() {
		g.setS(S); //adds array list to the grid
		g.addship(test); // adds ship to array list
		assertEquals(1,S.size()); // check if ship has been added
		g.remship(test);//remove ship 
		assertEquals(0,S.size()); //check that ship has been removed
	}
	@Test
	public void test3() {
		g.setS(S); //adds array list to the grid
		g.addship(test); // adds ship to array list
		g.addship(test2);
		int x = g.numsh();// check that method retrieves the number of ships
		assertEquals(2,x); //check that ship has been removed
	}
	@Test
	public void test4() {
		g.setS(S); //adds array list to the grid		
		int x = g.numsh();// check that method retrieves the number of ships
		assertEquals(0,x); //check that if loop in method numsh() works and that it prints out that the player loses when there are no ships
		}
}
