package qa;

public class TooHot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Hot(95, true));

	}

	static boolean Hot(int T, boolean isSummer)
	
	
	{
		if (isSummer)
			if (T>=60 && T<100)
				return true;
			else
				return false;
		
		else
			if (T>=60 && T<90)
				return true;
			else
				return false;
				
		
	}
}
