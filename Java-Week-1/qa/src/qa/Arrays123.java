package qa;
import java.util.Random;

public class Arrays123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = new int[10];
	
		
		for (int i=0; i<a.length; i++)
			{ Random rand = new Random();
			int  n = rand.nextInt(100) + 1;
			a[i]=n;
			System.out.println(a[i]);  // this bit is task 10 Iteration/Arrays
			}
		
		System.out.println("");
		System.out.println(qa.Conditionals2.addnum3(a[2],a[5],false));

	

	}

}
