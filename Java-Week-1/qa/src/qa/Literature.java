package qa;

public abstract class Literature extends Items {
	private String Name;
	private int Year;
	private String Author;
	
	
	public Literature(float price, boolean isReserved, int bookingDuration, String name, int year, String author) {
		super(price, isReserved, bookingDuration);
		Name = name;
		Year = year;
		Author = author;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getYear() {
		return Year;
	}


	public void setYear(int year) {
		Year = year;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}
	
	
	
	

}
