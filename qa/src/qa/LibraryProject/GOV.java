package qa.LibraryProject;

public class GOV extends Literature {
	private boolean isRestricted;

	public GOV(float price, boolean isReserved, int bookingDuration, String name, int year, String author,
			boolean isRestricted) {
		super(price, isReserved, bookingDuration, name, year, author);
		this.isRestricted = isRestricted;
	}

	public boolean isRestricted() {
		return isRestricted;
	}

	public void setRestricted(boolean isRestricted) {
		this.isRestricted = isRestricted;
	}

	
	

}
