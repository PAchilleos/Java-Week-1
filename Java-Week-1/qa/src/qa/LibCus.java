package qa;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class LibCus {
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int ID;
	private String Forename;
	private String Surname;
	private String Postcode;
	
	

		public LibCus(String forename, String surname, String postcode) {
		super();
		Forename = forename;
		Surname = surname;
		Postcode = postcode;
		ID = count.incrementAndGet(); 
	}



	public String getForename() {
		return Forename;
	}



	public void setForename(String forename) {
		Forename = forename;
	}



	public String getSurname() {
		return Surname;
	}



	public void setSurname(String surname) {
		Surname = surname;
	}



	public String getPostcode() {
		return Postcode;
	}



	public void setPostcode(String postcode) {
		Postcode = postcode;
	}



	public int getID() {
		return ID;
	}



	public ArrayList<LibCus> addCus(ArrayList<LibCus> I,LibCus i) {
		I.add(i);	
		return I;
	}

	public ArrayList<LibCus> removeCus(ArrayList<LibCus> I,LibCus i) {
		I.remove(i);
		return I;
	}
	
	public ArrayList<LibCus> replaceCus(ArrayList<LibCus> I,LibCus i) {
		int x =getIndex(I);
		I.set(x,i);		
		return I;
		//I.set(j,i);
	}
	
	 public int getIndex(ArrayList<LibCus> I)  //gets index by matching ID
	 {
	     for (int j = 0; j < I.size(); j++)
	     {
	    	 LibCus x = (LibCus) I.get(j);
	         if (x.getID()==ID)
	         {
	             return j;
	         }
	     } 

	     return -1;
	 } 
	

}
