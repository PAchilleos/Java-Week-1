package qa;

import java.util.Scanner;
import java.util.Random;

public class NumGuess {
	public static void main(String args[]){
	int lower=0;
	int upper =100;
	int num;
	String par1;
	String par2;
	String par3;
	
	Scanner sc1 = new Scanner(System.in);           
    System.out.println ("Enter a number between "+lower + " and "+upper);
    num = sc1.nextInt();
    Random g= new Random();
	int guess=g.nextInt(upper);
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Is your number "+guess+"? Probably not I'm not that good (y/n).");
	par1 = sc2.nextLine();
	
	Scanner sc3 = new Scanner(System.in);           
    System.out.println ("is it higher or lower?");    
    par2 = sc3.nextLine();
    
    Scanner sc4 = new Scanner(System.in);           
    System.out.println ("Was I hot, warm or cold?");    
    par3 = sc4.nextLine();
    
    while (!(par1.equals("y"))){
    	if (par2.equals("higher")){
			if (par3.equals("hot")==true){
				guess=((upper-guess)/6)+guess;
			}
			else if (par3.equals("warm")){
				guess=((upper-guess)/4)+guess;				
			}
			else if (par3.equals("cold")){
				guess=((upper-guess)/2)+guess;
			}
    	}
		else if (par2.equals("lower")==true){
			
			if (par3.equals("hot")){				
				guess=guess -(guess/6);
			}
			else if (par3.equals("warm")){
				guess=guess -(guess/4);				
			}
			else if (par3.equals("cold")){
				guess=guess -(guess/2);
			}	
		
		}	
    	System.out.println("Is your number "+guess+"? (y/n).");
		par1 = sc2.nextLine();
		if (par1.equals("y")){
			
		}
		else {
			System.out.println ("is it higher or lower?");    
			par2 = sc3.nextLine();
			System.out.println ("Was I hot, warm or cold?"); 
			par3 = sc4.nextLine();
		}
	}
		
	    System.out.println("Yay Got it");
	}
	
				
			

}
