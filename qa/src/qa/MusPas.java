package qa;
public class MusPas extends Items {
	private String Museum;
	private boolean isPremium;
	
	public MusPas(float price, boolean isReserved, int bookingDuration, String museum, boolean b) {
		super(price, isReserved, bookingDuration);
		Museum = museum;
		this.isPremium = b;
	}

	public String getMuseum() {
		return Museum;
	}

	public void setMuseum(String museum) {
		Museum = museum;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	
	

}
