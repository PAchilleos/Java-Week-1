package qa;
import java.util.Random;

public class Iteration_Arrays {
	public static void main(String[] args) {
	
	int[] a = new int[10];
	
	
	for (int i=0; i<a.length; i++)
		{ Random rand = new Random();
		int  n = rand.nextInt(100) + 1;
		a[i]=n;
		System.out.println(a[i]);  // this bit is task 10 Iteration/Arrays
		}
	
	System.out.println("");
	
	//task 11
	
	for (int i=0; i<a.length; i++)
		{ 
		System.out.println(a[i]);  // this bit is task 10 Iteration/Arrays
		a[i]=a[i]*10;
		System.out.println(a[i]);
		System.out.println("");
		}

	}

}
