/*If the number is greater than 1, then return You entered more
If the number is less than or equal to 1 then return You entered less */

import java.util.Scanner;
public class conditional {
    public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	   
	    if(n>1) // (n = 2,3,4,5,6,7,8,9...........)
	    {
	        System.out.println("You entered more");
	    }
	    else // n = (-ve,0,1)
	    {
	        System.out.println("You entered less");
	    }
	}
}
