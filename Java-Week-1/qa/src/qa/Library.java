package qa;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


public class Library {
	
	public static void main(String args[]) {
		
		ArrayList<Items> I = new ArrayList<Items>();// create initial library collection
		Book b= new Book(19.99f, false, 12, "Testing for Dummies", 2010, "QA Man", true,false, true);
		Book b2= new Book(40.50f, true, 21, "My Life", 2015, "Celeb Man", true,false, true);	
		GOV g= new GOV(10.40f, true, 150, "Secret Stuff", 2005, "Agent Man",true);
		
		Diss d = new Diss(5.99f, true, 55, "Greenhouse climate and control system ", 2017,"David Jiang", "Alex","Sheffield Hallam");
		MusPas m = new MusPas(19.99f, false, 1, "Museum of Cool Stuff", true);	
		
		b.addItem(I, b);  //b.addItem(I)
		b.addItem(I, d);
		b.addItem(I, b2);		
		b.replaceItem(I,m); //replaces book with museum pass
		b.addItem(I,g);		
		//System.out.println(g.getPrice());
		
		try {
			PrintWriter  pw = new PrintWriter("C:\\Users\\Profile\\Desktop\\items.txt", "UTF-8");
			
			
			for(int i=0; i<I.size();i++) {			
				Items w=I.get(i);
				String cl= w.getClass().getSimpleName();		
				
				
				if (cl.equals("GOV")) 
				{
					cl = "Government Document";
					GOV x= (GOV) I.get(i);
				    pw.println("Item: "+cl+System.lineSeparator()+ "Name: "+x.getName()+System.lineSeparator()+ "Author: " + x.getAuthor() + System.lineSeparator()+"Price: £"+x.getPrice()+System.lineSeparator()+"Reserved: "+ x.isReserved()+System.lineSeparator()+"Booking Duration: "+ x.getBookingDuration()+" days"+System.lineSeparator()+"Restricted: "+x.isRestricted()+System.lineSeparator());
				}
				else if (cl.equals("MusPas")) {
					cl= "Museum Pass";
					MusPas x =(MusPas) I.get(i);				
					pw.println("Item: "+cl+ System.lineSeparator()+"Museum: "+x.getMuseum()+System.lineSeparator()+"Price: £"+x.getPrice()+System.lineSeparator()+"Reserved: "+ x.isReserved()+System.lineSeparator()+"Booking Duration: "+ x.getBookingDuration()+" days"+System.lineSeparator());
				}
				else if (cl.equals("Diss")) {
					cl= "Dissertation";
					Diss x = (Diss) I.get(i);
					pw.println("Item: "+cl+ System.lineSeparator()+"Name: "+x.getName()+ System.lineSeparator()+"Author: " + x.getAuthor() + System.lineSeparator()+"Contributor: "+ x.getContributor()+System.lineSeparator()+"University "+ x.getUni() + System.lineSeparator()+"Price: £"+x.getPrice()+System.lineSeparator()+"Reserved: "+ x.isReserved()+System.lineSeparator()+"Booking Duration: "+ x.getBookingDuration()+" days"+System.lineSeparator());
				}
				else {
					Book x = (Book) I.get(i);
					pw.println("Item: "+cl+ System.lineSeparator()+"Name: "+x.getName()+ System.lineSeparator()+"Author: " + x.getAuthor() + System.lineSeparator()+"Price: £"+x.getPrice()+System.lineSeparator()+"Reserved: "+ x.isReserved()+System.lineSeparator()+"Fiction: "+ x.isFiction()+ System.lineSeparator()+"Ebook: " +x.isEbook()+ System.lineSeparator()+"Audio Book: "+ x.isAudioBook() +System.lineSeparator()+"Booking Duration: "+ x.getBookingDuration()+" days"+System.lineSeparator());
				}
				
				}	
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//System.out.println(m.getClass().getSimpleName());
		
		
		
		
	}
	
	

	

	
}
