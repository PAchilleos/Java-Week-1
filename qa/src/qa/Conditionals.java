package qa;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addnum2(2,8, true));

	}
	static int addnum2(int a, int b, boolean c)
	{
		if (c == true)
		{
			return a+b;
		}
		else
		{
			return a*b;
		}			
	}
	
}
