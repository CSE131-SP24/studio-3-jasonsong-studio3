package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the last number: ");
		int num = in.nextInt();
		boolean [] initial = new boolean [num-1];
		
		//Create the initial list
		int devider = 2;
		int numCount=0;
		//start the loop
		while (devider<num-2)
				{
			
			int n = devider;
			while (n<=num)
			{
			double remainder = n%devider;
			boolean devide= (remainder==0);
			boolean nonEqual=(n!=devider);
	       if (devide&&nonEqual&&initial [n-2]==false)
	       
	    	   {
	    	   initial [n-2] = true;
	    	   n++;
	    	   numCount=numCount+1;
	    	   }
	    	   else
	    	   {
	    		   n++;
	    	   }
	   
	  
	       
	       
	     }
			devider=devider+1;
	}
		System.out.println("There are "+ (num-1-numCount)+ " prime numbers before "+num+", they are: "); 
		int a=0;
		 while (a<=num-2)
	     {
			 if (initial [a]==false)
	       {
			System.out.print(a+2+ " "); 
	    	   a++;
	       }
	       else
	       {
	    	   a++;
	       }
}

}
	}