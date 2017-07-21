package qa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Spiral {
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		Scanner s = new Scanner(System.in);           
        System.out.println ("Enter number :"); 
        int n = s.nextInt();
        
        int minRowPos = 0;
		int minCollumnPos =0;
		int maxRowPos= n-1;
		int maxCollumnPos= n-1;
		int v = 1;
		
		int[][] spiral = new int[n][n] ;
		
		while ( v <= n*n)
		{
			for(int i = minCollumnPos; i<=maxCollumnPos;i++ )
			{
				spiral[minRowPos][i]=v;
				v++;
				
			}
			
			for(int i= minRowPos+1;i<=maxRowPos;i++)
			{
				spiral[i][maxCollumnPos]= v;
				
				v++;
				
			}	
		
			for(int i= maxCollumnPos-1;i>=minCollumnPos;i--)
			{
				spiral[maxRowPos][i]= v;
				v++;
			}	
			
			for(int i= maxRowPos-1;i>=minRowPos+1;i--)
			{
				spiral[i][minCollumnPos]= v;
				v++;
				
			}	
			
			 minRowPos++;
		     minCollumnPos++;
		     maxRowPos--;
			 maxCollumnPos--;
		
			for (int i = 0; i < spiral.length; i++)
			{
				for (int j= 0; j < spiral.length; j++)
				{
					System.out.print(spiral[i][j]+ "\t");
				}
				System.out.println();
			}
			System.out.println("");
			Thread.sleep(250);
			//System.out.print("\033[H\033[2J");
			char c = '\n';
			int length = 25;
			char[] chars = new char[length];
			Arrays.fill(chars, c);
			System.out.print(String.valueOf(chars));
			
		}
		
		
			
			
	
	}
		

	
	
	

	
}	



