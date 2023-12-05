import java.util.Scanner;

public class hcf {
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        
        // STEP 1 -> Input 2 numbers 
        // STEP 2 -> Run a loop why ? (One point to another point)
        // STEP 3 -> 1 to minimum number (smaller number)
        // STEP 4 -> condition to find out whether current number divides both the numbers 
        
        int a = in.nextInt();
        int b = in.nextInt();
        
        // int min = 1;
        // if(a<b)
        // {
        //     min = a;
        // }
        // else
        // {
        //     min = b;
        // }
        
        int min = b;
        if(a<b)
        {
            min = a;
        }
        
        int gcd = 0;
        
        // a = 3, b = 6
        // STEP 1: i = 1, 1<=3 (True), 1 can divide both 3 and 6, gcd = 1, i will updated to 2
        // STEP 2: i = 2, 2<=3 (True), 2 cannot divide both 3 and 6, gcd = 1, i will updated to 3
        // STEP 3: i = 3, 3<=3 (True), 3 can divide both 3 and 6, gcd = 3, i will updated to 4 
        // STEP 4: i = 4, 4<=3 (False), The loop will stop 
        for(int i=1; i<=min; i=i+1)
        {
            if(a%i==0 && b%i==0)
            {
                gcd = i;
            }
        }
        
        // GCD needs to printed only one time, that's why we write it outside the loop 
        System.out.println(gcd);
    }
}
