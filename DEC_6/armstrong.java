//Armstrong Numbers in Range

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt(); // starting point 
		int n = in.nextInt(); // ending point 
		
		// RULE -> inside the for loop you will never makea any change in i or counter variable
		
		// m = 100 
		// n = 200
		// Values first loop -> 100, 101, 102, ................. 153, ............... 200 
		for(int i=m; i<=n; i=i+1)
		{
		    // whether this i number is armstrong number 
		    // Any question which has DIGITs of a number, we will use while loop  
		    
		    // For checking armstrong number 
		    // STEP 1 -> number of digits of i by storing copy of i 
		    int numberOfDigits = 0;
		    int temp = i;
		    
		    // (STEP 1) temp = 153, numberOfDigits = 0 + 1 = 1, temp = 153/10 = 15 
		    // (STEP 2) temp = 15, numberOfDigits = 1 + 1 = 2, temp = 15/10 = 1 
		    // (STEP 3) temp = 1, numberOfDigits = 2 + 1 = 3, temp = 1/10 = 0
		    // (STEP 4) temp>0 will false, The loop will stop 
		    while(temp>0)
		    {
		        numberOfDigits = numberOfDigits + 1;
		        
		        // remove the last digit everytime 
		        temp = temp/10;
		    }
		    
		    // Sum of digits of a number (where every digit is raised to power number of digits)
		    int sum = 0;
		    temp = i;
		    
		    // numberOfDigits = 3
		    // (STEP 1) temp = 153, lastDigit = temp%10 = 3, power = 3^3 = 27, sum = 0 + 27 = 27, temp = 15 
		    // (STEP 2) temp = 15, lastDigit = 15%10 = 5, power = 5*5*5 = 125, sum = 125 + 27 = 152, temp = 1 
		    // (STEP 3) temp = 1, lastDigit = 1%10 = 1, power = 1*1*1 = 1, sum = 152 + 1 = 153 
		    while(temp>0)
            {
                // STEP 1 (Find out last digit from the original number)
                int lastDigit = temp%10;
                
                // STEP 2 (We will add the lastDigit^numberOfDigits we found out, in a variable)
                sum = sum + (int)Math.pow(lastDigit, numberOfDigits);
                
                // STEP 3 (We will remove last digit from original number)
                temp = temp/10;
            }
            
            if(sum == i)
            {
                // Then it will be an armstrong number 
                System.out.print(i + " ");
            }

		}
		
	}
}
