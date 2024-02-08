package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the last number: ");
		int num = in.nextInt();
		boolean [] initial = new boolean [num-1];
		
		//Create the initial list
		int deltaN = 1;
		int oldCount = 0;
		int devider = 2;
		int numCount=0;
		//start the loop
		while (deltaN !=0)
				{
			
			int n = devider-1;
			while (n<num-2)
			{
			double remainder = n%devider;
			boolean devide= (remainder==0);
	       if ((!devide||n==devider)&&initial [n+1]==false)
	       
	    	   {
	    	   initial [n+1] = true;
	    	   n++;
	    	   numCount=numCount+1;
	    	   }
	    	   else
	    	   {
	    		   n++;
	    	   }
	   
	  
	       
	       
	     }
			devider=devider+1;
			 deltaN=oldCount-numCount;
		       oldCount=numCount;
			System.out.println(numCount);
	}

}
}