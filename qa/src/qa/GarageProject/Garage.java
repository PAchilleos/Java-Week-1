package qa.GarageProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1= new Car("Audi","R8 v10","Unleaded Petrol",205, 449, 3.2, 80000, 10000, true, true, 2015, 1555,120000,true,false,false);
		Motorcycle m1 = new Motorcycle("Ducati", "Multistrada 1200 s", "Electric", 145, 150, 3.2, 10000,5000, false, false, 2012, 189, 17000, true);
		Lorry l1 = new Lorry("Red Lorry", "Forklift", "Diesel", 80, 1500, 20, 250000,5000, true,false, 2008, 10000, 50000, true,1500);
		
				
		Vehicle[] a ={c1,m1,l1};
		ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
		
		for(int i=0; i<a.length; i++){
			garage.add(a[i]);
		}
		
		
		
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner (System.in);
        System.out.println("Which Car do you want to remove from the garage? (Enter Car Make) ");
		String input = sc.nextLine();
		
		
		
 	for (int i=0; i<garage.size();i++)
		{
			if (garage.get(i).make.equals(input))
			{
				garage.remove(i);
			}
		}
 	
 	    System.out.println("");
 	
		if (garage.isEmpty())
			System.out.println("No Cars in Garage!");
		else
			for (int i =0; i<garage.size();i++)			
		{
			System.out.println("The bill for storing the "+ garage.get(i).make +" "+garage.get(i).model +" in the garage is £" + garage.get(i).cost());
			System.out.println("The cost to repair the " + garage.get(i).make +" "+garage.get(i).model +" is £"+garage.get(i).fix());
		}
	}

}
