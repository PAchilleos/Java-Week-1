package qa;

public class Conditionals2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addnum3(10,0, false));
	}
	static int addnum3(int a, int b, boolean c)
	{
		if (a==0)
		{ return b;
				
		}
		if (b==0)
		{ return a;
				
		}
		else
		{   if (c == true)
			{
				return a+b;
			}
			else
			{
				return a*b;
	
			}
		}
	}
	
}
