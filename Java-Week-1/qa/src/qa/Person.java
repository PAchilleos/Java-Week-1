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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}
