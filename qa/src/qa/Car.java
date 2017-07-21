package qa;

public class Car extends Vehicle {
	
	boolean isFWD;  //four wheel drive	
	boolean isRWD; // rear wheel drive
	boolean isConvertible;
	
	
	
	
	public Car(String make, String model, String fueltype, int maxspeed, int horsepower, double acc, int milage,
			int runningcost, boolean isInsured, boolean isAuto, int yearreg, int weight, int price, boolean isFWD,
			boolean isRWD, boolean isConvertible) {
		super(make, model, fueltype, maxspeed, horsepower, acc, milage, runningcost, isInsured, isAuto, yearreg, weight,
				price);
		this.isFWD = isFWD;
		this.isRWD = isRWD;
		this.isConvertible = isConvertible;
	}



		public void cardet(){
			System.out.println("Make: " + make);
			System.out.println("Model: "+ model);
			System.out.println("Fuel Type: "+ fueltype);
			System.out.println("Weight: "+ weight +"kg");
			System.out.println("Price: £"+ price);
			System.out.println("Max Speed: "+ maxspeed +" mph");
			System.out.println("Horsepower: "+ horsepower +"HP");
			System.out.println("0-60 mph in : "+ acc +"s");
			System.out.println("Max Speed: "+ maxspeed +"mph");
			System.out.println("FWD: "+ isFWD);
			System.out.println("RWD: "+ isRWD);
			System.out.println("Convertible: "+ isConvertible);
			System.out.println("Milage: "+ milage +" miles");
			System.out.println("Running Cost : £"+ runningcost);
			System.out.println("Insured: "+ isInsured);
			System.out.println("Automatic: "+ isAuto);
			System.out.println("Year Registered: "+ yearreg);
		}
		
		
		
			
		
	
}
