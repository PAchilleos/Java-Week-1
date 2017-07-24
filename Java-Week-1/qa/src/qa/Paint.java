package qa;

public class Paint {
	public String name;
	public int litres; //per tin
	public double price; //pounds
	public int area; //per litre
	
	
	public Paint(String name, int litres, double price, int area) {
		super();
		this.name = name;
		this.litres = litres;
		this.price = price;
		this.area = area;
	}
	
	
	
	
	public int metcov(){   // how many m^2 each tin covers
		return litres*area;
	}
	
	

}
