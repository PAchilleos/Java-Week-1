package qa;

public class Person {
	String name;
	int age;
	String job;
	
	public String det()
	{
			return "My name is " + name + ", I am "+ age + " years old and I am a "+ job;
	}
	
	public Person(String a, int b, String c)
	{
	    name = a;
		age = b;
		job = c;
	}
}
