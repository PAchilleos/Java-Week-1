package qa;

public class Blackjack {
	public static void main(String[] args) {
		System.out.println(blackjack(21,22));
		
	}
static int blackjack(int a, int b)
{
	if (a>21)	
		a=0;	
	                      //avoid numbers over 21 from winning
	if (b>21)
		b=0;
	
	
	
	if (a>b)
		return a;
	else if (b==a)
		return b;
	else  //b>a
		return b;
}
}
