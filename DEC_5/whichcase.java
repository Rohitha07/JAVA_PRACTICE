/*print 1, if the character is a uppercase alphabet(A to Z)

0, if the character is a lowercase alphabet(a to z)

-1, if the character is not an alphabet */

import java.util.Scanner;
public class whichcase {
    public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		char c = in.next().charAt(0);
		
		// implicit type casting (WATCH 6th FEB Recording)
		int a = c;
		
		// 'A' - 'Z' --> 65 - 90 (Upper case letters)
		// 'a' - 'z' --> 97 - 122 (Lower case letters)
		
		if(a>=65 && a<=90)
		{
		    System.out.println("1"); // UPPER CASE LETTER 
		}
		else if(a>=97 && a<=122)
		{
		    System.out.println("0"); // lower CASE LETTER 
		}
		else 
		{
		    System.out.println("-1");
		}
	}
}
