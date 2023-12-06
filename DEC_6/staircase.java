import java.util.Scanner;
public class staircase {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		// Let's suppose n = 3
		for(int i=1;i<=n;i=i+1) // handling the number of stars changed 
		{
		    // We will print spaces also 
		    // How many spaces we need to print ? --> n - i 
		    for(int j=1;j<=(n-i);j=j+1)
		    {
		        System.out.print(" ");
		    }
		    
		    // STEP 1--> i = 1, 1<=3 (True), i will be updated to 2 
		    // STEP 2--> i = 2, 2<=3 (True), i will be updated to 3 
		    // STEP 3--> i = 3, 3<=3 (True), i will be updated to 4
		    
		    // i variable is storing what are the number of stars in that row 
		    // Now we need to print i stars, so what we should do now ?
		    // There will another for loop, that will be running i times 
		    // Printing the ith row 
		    for(int j=1;j<=i;j=j+1) // printing the number of stars in a row 
		    {
		        System.out.print("#");
		    }
		    // Once a row is printed we will change the line 
		    System.out.println(); 
		}
	}
}
