// find the sum of all the digits in the given number.

import java.util.Scanner;
public class sumofdigits {
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        // Since these steps need to be done multiple times we will use a LOOP 
        // STEP 1 (Find out last digit from the original number)
        // STEP 2 (We will add the last digit we found out in a variable)
        // STEP 3 (We will remove last digit from original number)
        
        int sum = 0;
        
        // STEP 1) n=12345, lastDigit = n%10 = 5, sum = 0 + 5 = 5, n = 1234 
        // STEP 2) n=1234, lastDigit = n%10 = 4, sum = 5 + 4 = 9, n = 123
        // STEP 3) n=123, lastDigit = n%10 = 3, sum = 9 + 3 = 12, n = 12 
        // STEP 4) n=12, lastDigit = n%10 = 2, sum = 12 + 2 = 14, n = 1 
        // STEP 5) n=1, lastDigit = n%10 = 1, sum = 14 + 1 = 15, n = 0
        // STEP 6) n=0, n>0 (False), the loop will stop Why? (Because all digits are finished)
        
        while(n>0)
        {
            // STEP 1 (Find out last digit from the original number)
            int lastDigit = n%10;
            
            // STEP 2 (We will add the last digit we found out, in a variable)
            sum = sum + lastDigit;
            
            // STEP 3 (We will remove last digit from original number)
            n = n/10;
        }
        
        System.out.println(sum);
        
    }
}
