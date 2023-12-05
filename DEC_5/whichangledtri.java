import java.util.Scanner;

public class whichangledtri {
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        
        // STEP 1 (Input three number)
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        
        // STEP 2 We need to find out the maximum side 
        // If we don't initialise with some value then program will throw a error 
        int maximumSide = 0;
        
        // maximumSide = a, maximumSide = b, maximumSide = c (Either of them is correct)
        
        if(a>b && a>c)
        {
            // For a to be the maximum side 
            maximumSide = a;
        }
        else if(b>a && b>c)
        {
            // For b to be the maximum side 
            maximumSide = b;
        }
        else
        {
            maximumSide = c;
        }
        
        // acute angle triangle 
        // A triangle is acute-angled, if twice the square of the largest side is less than the sum of squares of all the sides.
        // STEP 3 
        if(2*maximumSide*maximumSide < (a*a + b*b + c*c))
        {
            // for acute angle triangle we need to print 1 
            System.out.println("1");
        }
        else if(2*maximumSide*maximumSide > (a*a + b*b + c*c))
        {
            // for obtuse angle triangle 
            System.out.println("3");
        }
        else 
        {
            // for right angle triangle 
            System.out.println("2");
        }
    }
}
