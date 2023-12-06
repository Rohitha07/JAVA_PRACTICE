// find the value of one number raised to the power of another.
import java.util.Scanner;
public class powofnum {
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        
        long a = in.nextLong();
        long b = in.nextLong();
        
        long power = 1L;
        
        // a = 2, b = 5
        // STEP 1: i=1, 1<=5 (True), power = 1*2 = 2, i will be updated to 2
        // STEP 2: i=2, 2<=5 (True), power = 2*2 = 4, i will be updated to 3
        // STEP 3: i=3, 3<=5 (True), power = 4*2 = 8, i will be updated to 4
        // STEP 4: i=4, 4<=5 (True), power = 8*2 = 16, i will be updated to 5
        // STEP 5: i=5, 5<=5 (True), power = 16*2 = 32, i will be updated to 6 
        for(int i=1; i<=b; i=i+1)
        {
            power = power * a;
        }
        
        // This needs to be done 1 time so we are writing outside the loop
        System.out.println(power);
    }
}
