import java.util.*;

public class starpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space=n-1;
		int count=0;

		for(int i=1;i<=n;i++)
			{
				for(int k=1;k<=space;k++)
					{
						System.out.print(" ");
					}
				space=space-1;
				count=i;
				for(int j=1;j<=count;j++)
					{
						System.out.print("* ");
					}
				System.out.println();
			}
    }
}
