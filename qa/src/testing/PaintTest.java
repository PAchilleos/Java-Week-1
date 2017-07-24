package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import qa.PaintProject.Paint;

public class PaintTest {

	@Test
	public void test1() {
		Paint t= new Paint("CheapoMax",21,19.99,10);
		assertEquals(20,t.litres);
	}
	@Test
	public void test2() {
		Paint t = new Paint("CheapoMax",20,19.99,10);
		int act = t.metcov();
		int exp =(t.litres)*(t.area);
		assertEquals(act,exp);
	}

}
