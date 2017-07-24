package qa;

public class People {
	public static void main(String[] args) {
		Person p1 = new Person("Dave", 45, "Builder");
		Person p2 = new Person ("Harrold", 50, "Project Manager");
		Person p3 = new Person ("Chloe", 22 , "Architecht");
		Person p4 = new Person ("Peter" , 18, "Student");
		
		
		Person[] a ={p1, p2, p3, p4};
		
		for (int i=0; i< a.length; i++)
		{
			System.out.println(a[i].det());
		}	
		
		
	}
}
