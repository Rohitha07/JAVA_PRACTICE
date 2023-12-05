import java.util.*;
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0;t<test;t++)
			{
				int n = sc.nextInt();
				for(int i=1;i<=n/2+1;i++)
					{
						for(int j=i;j<n/2+1;j++)
							{
								System.out.print("  ");
							}
						for(int k=1;k<=(2*i -1);k++)
							{
								System.out.print("* ");
							}
						System.out.println();
					}
				for(int i=n/2;i>=1;i--)
					{
						for(int j=i;j<n/2+1;j++)
							{
								System.out.print("  ");
							}
						for(int k=1; k<=(2*i -1); k++)
							{
								System.out.print("* ");
							}
						System.out.println();
					}
			}
				
	}
 
}
