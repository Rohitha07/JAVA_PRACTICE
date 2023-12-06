import java.util.*;
public class contcharpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        // write code here
		int a = 65;
		for(int i = 0; i<n; i++)
			{
				a = 65+i;
				for (int j=0; j<=i; j++)
					{
						System.out.print((char) a);
						a++;
						if (a==91)
						{
							a=65;
						}
					}
				System.out.println();
			}
    }
}
