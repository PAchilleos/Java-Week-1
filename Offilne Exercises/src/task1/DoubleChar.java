package task1;

public class DoubleChar {
	
	public void dc(String s) {
		s.split(s);
		char[] chars = s.replaceAll("\\s+", "").toLowerCase().toCharArray();
	
		for (int i =0; i<chars.length;i++) {
			char[] c = {chars[i],chars[i]};
			String Si = String.valueOf(c);
			System.out.print(Si);			
		}
		
		
	}
	

}
