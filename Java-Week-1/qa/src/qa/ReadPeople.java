package qa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadPeople {

	public static void main(String[] args) {
		ArrayList<Person> p= new ArrayList<Person>();
		Person p1 = new Person("Dave", 45, "Builder");
		Person p2 = new Person ("Harrold", 50, "Project Manager");
		Person p3 = new Person ("Chloe", 22 , "Architecht");
		Person p4 = new Person ("Peter" , 18, "Student");
		Person p5 = new Person ("Kevin", 22, "Plumber");
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		
		try {
			PrintWriter w = new PrintWriter("C:\\Users\\Profile\\Desktop\\peeps.txt", "UTF-8");
			
			for (int i=0; i<p.size();i++){
				Person x=p.get(i);
				w.println(x.getName()+ ", "+x.getAge()+ ", " + x.getJob());
			}
			w.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Scanner s = new Scanner(new File("C:\\Users\\Profile\\Desktop\\peeps.txt"));
			ArrayList<Person> pread= new ArrayList<Person>();
			
			while (s.hasNextLine()) {
				String[] si=s.nextLine().split(", ");
				
				for (int i =0; i<si.length; i++) {
					System.out.println(si[i]);					
				}
				System.out.println("");
				int n =Integer.parseInt(si[1]);
				//System.out.println(n);
				Person pup = new Person(si[0],n,si[2]);
				pread.add(pup);
				
			}
		}

			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
