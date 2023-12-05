/*If both integers are odd, print `we are odd`.
Else print `we are simple`. */

import java.util.Scanner;
public class odd {
    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a%2!=0 && b%2!=0)
		{
		    System.out.println("we are odd");
		}
		else 
		{
		    System.out.println("we are simple");
		}
	}
}
