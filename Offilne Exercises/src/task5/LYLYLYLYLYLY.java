package task5;

public class LYLYLYLYLYLY {
	
	public boolean ly(String s) {
		if (s.contains("ly")){
			int x = s.length();
			char a = s.charAt(x-1);
			char a2 = s.charAt(x-2);
			String S = String.valueOf(a);
			String S2 = String.valueOf(a2);
			if (S.equals("y")) {
				if (S2.equals("l")) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
		}
		else {
			return false;
		}
	}

}
