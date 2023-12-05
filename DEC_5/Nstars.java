//print n stars * vertically and n horizontally.

import java.util.Scanner;
public class Nstars {
    public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    // Let's suppose n = 3
	    
	    // N stars horizontally
	    // STEP 1 --> i=1, 1<=3(True), STAR will be printed, i will updated = 2 
	    // STEP 2 --> i=2, 2<=3(True), STAR will be printed, i will updated = 3 
	    // STEP 3 --> i=3, 3<=3(True), STAR will be printed, i will updated = 4 
	    // STEP 4 --> i=4, 4<=3(False), LOOP WILL STOP 
	    // I need to print n stars horizontally in a single line 
	    for(int i=1; i<=n; i=i+1)
	    {
	        System.out.print("* ");
	    }
	    // * * * 
	    
	    // We need to shift the cursor to a new line 
	    // How can we do this ?
	    System.out.println();
	    
	    // N stars vertically 
	    // STEP 1 --> i=1, 1<=3(True), STAR will be printed, i will updated = 2 
	    // STEP 2 --> i=2, 2<=3(True), STAR will be printed, i will updated = 3 
	    // STEP 3 --> i=3, 3<=3(True), STAR will be printed, i will updated = 4 
	    // STEP 4 --> i=4, 4<=3(False), LOOP WILL STOP 
	    for(int i=1; i<=n; i=i+1)
	    {
	        System.out.println("*");
	    }
	}
}
