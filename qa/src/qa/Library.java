package qa;
import java.util.ArrayList;


public class Library {
	
	public static void main(String args[]) {
		ArrayList<Items> I = new ArrayList<Items>();// create initial library collection
		Book b= new Book(19.99f, false, 12, "Testing for Dummies", 2010, "QA Man", true,false, true);
		Book b2= new Book(40.50f, true, 21, "My Life", 2015, "Celeb Man", true,false, true);	
		
		Diss d = new Diss(5.99f, true, 55, "Greenhouse climate and control system ", 2017,"David Jiang", "Alex","Sheffield Hallam");
		MusPas m = new MusPas(19.99f, false, 1, "Museum of Cool Stuff", true);	
		
		b.addItem(I, b);  //b.addItem(I)
		b.addItem(I, d);
		b.addItem(I, b2);
		
		b.replaceItem(I,m);
		//System.out.println(b.getIndex(I));
		System.out.println(m.getIndex(I));
		System.out.println(m.getMuseum());
		
		//Diss w=(Diss) I.get(2);
		//System.out.println(w.getName());
		
		//System.out.println(d.getIndex(I));
		
		
		//System.out.println(b.getID());
		//System.out.println(b2.getID());
		//System.out.println(d.getID());
		//System.out.println(m.getID());
		
		//getIndex(I,b);
		
	    //System.out.println(b.getIndex(I));
		
		//addItem(b)
		
		
		
	}
	
	

	

	
}
