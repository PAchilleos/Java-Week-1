package qa;

public class Diss extends Literature {  //dissertations
	String Contributor;
	String Uni; //University
	
	
	public Diss(float price, boolean isReserved, int bookingDuration, String name, int year, String author,
			String contributor, String uni) {
		super(price, isReserved, bookingDuration, name, year, author);
		Contributor = contributor;
		Uni = uni;
	}


	public String getContributor() {
		return Contributor;
	}


	public void setContributor(String contributor) {
		Contributor = contributor;
	}


	public String getUni() {
		return Uni;
	}


	public void setUni(String uni) {
		Uni = uni;
	}
	
	
	
	

}
