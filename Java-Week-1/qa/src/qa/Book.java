package qa;

public class Book extends Literature{
	private boolean isEbook;
	private boolean isFiction;	
	private boolean isAudioBook;
	
	public Book(float price, boolean isReserved, int bookingDuration, String name, int year, String author,
			boolean isEbook, boolean isFiction, boolean isAudioBook) {
		super(price, isReserved, bookingDuration, name, year, author);
		this.isEbook = isEbook;
		this.isFiction = isFiction;
		this.isAudioBook = isAudioBook;
	}

	public boolean isEbook() {
		return isEbook;
	}

	public void setEbook(boolean isEbook) {
		this.isEbook = isEbook;
	}

	public boolean isFiction() {
		return isFiction;
	}

	public void setFiction(boolean isFiction) {
		this.isFiction = isFiction;
	}

	public boolean isAudioBook() {
		return isAudioBook;
	}

	public void setAudioBook(boolean isAudioBook) {
		this.isAudioBook = isAudioBook;
	}
	
	
	
	
	
	
	

}
