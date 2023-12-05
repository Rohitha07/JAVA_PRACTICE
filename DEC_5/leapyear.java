//Given a year, find if it is a leap year.

import java.util.Scanner;
public class leapyear 
{
	public static void main(String[] arg) 
	{
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		
		if(year%4 == 0)
		{
		    if(year%100 == 0)
		    {
		        if(year%400 == 0)
		        {
		            // 2000, 1600, 2400 (They are leap years)
		            System.out.println("1");
		        }
		        else // they are not divisible by 400
		        {
		            // 1700, 1900 
		            System.out.println("0");
		        }
		    }
		    else // they are not divisible by 100
		    {
		        // 2004, 2016, 2012, 2008 (They are leap year)
		        System.out.println("1");
		    }
		}
		else // they are not divisible by 4 
		{
		    // 1997,2003,2007,2011 (they are not leap years)
		    System.out.println("0");
		}
	}
}



