import java.util.*;
public class evensum
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        // you can take here sum as long also 
        long sum = 0L;
        
        for(int i=2; i<=n; i=i+2)
        {
            sum = sum + i;
        }
        
        // we want to print it only one time 
        System.out.println(sum);
    }
}