import java.util.*;
public class charpattern {
    public static void pattern(int n)
    {
        //Write code here
		for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
					{
						System.out.print((char)(i+64));
					}
						System.out.println();
			}
    }
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
