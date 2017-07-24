package qa;

public class UniqueSum {
	public static void main(String[] args) {
		
		System.out.println(summy(3,2,2));
		 
		 
		  
		
	}
	static int summy(int a, int b,int c)
	{
		if (a==b && a==c)
			return 0;
		else if (a==c && a!=b)
			return b;
		else if (b==c)
			return a;
		else if (a==b && a!=c)
			return c;		
		else
			return a+b+c;
		
		//THERE IS A BETTER WAY OF DOING THIS!!
				
	}
}
