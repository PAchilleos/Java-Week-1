package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import qa.Book;
import qa.Diss;
import qa.Items;
import qa.LibCus;
import qa.MusPas;

public class LibraryTest {
	ArrayList<Items> I = new ArrayList<Items>();// create initial library collection
	Book b= new Book(19.99f, false, 0, "Testing for Dummies", 2010,"QA Man", true,false, true);
	Book b2= new Book(40.50f, true, 21, "My Life", 2015,"Celeb Man", true,false,  true);
	Diss d = new Diss(5.99f, true, 55, "Greenhouse climate and control system ", 2017,"David Jiang", "Alex","Sheffield Hallam");
	MusPas m = new MusPas(19.99f, false, 1, "Museum of Cool Stuff", true);
	LibCus c = new LibCus("Bob", "Smith ", "M10 5FD");
	LibCus c2 = new LibCus("Sally", "West ", "N14 4ET");
	

	@Test
	public void test1() { //tests adding an item to the Library
		b.addItem(I,b); //add book 										// want in this format: b.addItem(I);
		assertEquals(1, I.size());
		Items  w = (Items) I.get(0); // retrieve book
		assertEquals(b.getID(), w.getID()); //compare attribute
		
	}
	
	@Test
	public void test2() { //tests removing an item from the Library
		b.addItem(I,b); // add item first
		b.removeItem(I, b); // remove item
		assertEquals(0, I.size()); // check if it has been removed
	}
	
	@Test
	public void test3()	{ //tests method for retrieving the index of the item;
		b.addItem(I, b);  
		b.addItem(I, b2);
		b.addItem(I, d);	
		
		
		assertEquals(0,b.getIndex(I)); // check index of third item, should be 2
		
	}
	
	
	@Test
	public void test4() { //tests replace method;
		b.addItem(I, b);  
		b.addItem(I, b2);
		b.addItem(I, d);
		int x = b.getIndex(I); // get index of Book b to test if Museum Pass m has replaced it
		b.replaceItem(I,m); //replaces b with Museum m 
		assertEquals(-1, b.getIndex(I)); //check if Book b has been removed, should return -1 if method is correct
		assertEquals(x, m.getIndex(I));// check if  m is at the previous index of b
		
	}
	
	

}
