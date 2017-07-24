package qa;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Items{
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int ID;
	private float Price;
	private boolean isReserved;
	private int BookingDuration; //days
	
	public Items(float price, boolean isReserved, int bookingDuration) {
		super();
		Price = price;
		this.isReserved = isReserved;
		BookingDuration = bookingDuration;
		ID = count.incrementAndGet(); 
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public int getBookingDuration() {
		return BookingDuration;
	}

	public void setBookingDuration(int bookingDuration) {
		BookingDuration = bookingDuration;
	}

	public int getID() {
		return ID;
	}

	public ArrayList<Items> addItem(ArrayList<Items> I,Items i) {
		I.add(i);	
		return I;
	}

	public ArrayList<Items> removeItem(ArrayList<Items> I,Items i) {
		I.remove(i);
		return I;
	}
	
	public ArrayList<Items> replaceItem(ArrayList<Items> I,Items i) {
		int x =getIndex(I);
		I.set(x,i);		
		return I;
		//I.set(j,i);
	}
	
	 public int getIndex(ArrayList<Items> I)  //gets index by matching ID
	 {
	     for (int j = 0; j < I.size(); j++)
	     {
	         Items x= I.get(j);
	         if (x.getID()==ID)
	         {
	             return j;
	         }
	     } 

	     return -1;
	 } 
	
}

	





 