package qa;

public abstract class Vehicle {
	
	String make;
	String model;
	String fueltype;
	int maxspeed;  //mph
	int horsepower;  //hp
	double acc; //0-60mph time (s)
	int milage;  //miles  //used to calculate bill
	int runningcost;  //£  //used to calculate bill
	boolean isInsured;  //used to calculate bill
	boolean isAuto;
	int yearreg; //used to calculate bill
	
	int weight; //kg    /used to calculate bill
	int price; //in £   /used to calculate bill	
	
	
	public Vehicle(String make, String model, String fueltype, int maxspeed, int horsepower, double acc, int milage,
			int runningcost, boolean isInsured, boolean isAuto, int yearreg, int weight, int price) {
		super();
		this.make = make;
		this.model = model;
		this.fueltype = fueltype;
		this.maxspeed = maxspeed;
		this.horsepower = horsepower;
		this.acc = acc;
		this.milage = milage;
		this.runningcost = runningcost;
		this.isInsured = isInsured;
		this.isAuto = isAuto;
		this.yearreg = yearreg;
		this.weight = weight;
		this.price = price;
		
		
	
	}
	
	public int cost(){
		int k = (((price+runningcost))*((3/2)*weight))/1000000+(100*(2017-yearreg));
		k=(int) ((k*(Math.sqrt(milage)))/1000);
		if (isInsured == false)
			k=5*k;
				
		return k;
	}
	
	public int fix(){
		return price/20;
	}

	public String getmake() {
		return make;
	}
		
	public Boolean getAuto() {
		return isAuto;
	}
}
