package fibonacci;

import java.util.Arrays;

public class Fib {
	
	public int fibby(int n) {
		if (n==0) {
			return 0;
		}
		
		
		if (n==1) {
		return 1;
		}
		else {
			int[] a = new int[n];		
			Arrays.fill(a, 1);
			int i=2;
			
			
		while(i<n) {
			a[i]=a[i-1]+a[i-2];		
			i++;
		}
		
		return a[n-1];
		}
	}

}
