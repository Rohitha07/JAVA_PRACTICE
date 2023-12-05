//If the number is divisible by 6 then Divisible will be printed. If the number is not divisible by 6 then Not divisible will be printed.

import java.util.Scanner;
public class divisible {
    public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	   
	    if(n%6==0) 
	    {
	        System.out.println("Divisible");
	    }
	    else
	    {
	        System.out.println("Not divisible");
	    }
	}
}
