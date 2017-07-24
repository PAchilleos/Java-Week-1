package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import qa.GarageProject.Car;
public class GarageTest {

	Car test= new Car("Testmobile","v3","nuclear fuel",1000, 5000, 0.5, 15000, 50000, true, true, 2017, 10000,120000,true,false,false);
	@Test
	public void test() {		
				assertEquals("Testmobile",test.getmake());
	}

	@Test
	public void test2() {		
				assertEquals(true ,test.getAuto());
	}
	
}
