// integers between 1 and n that are prime

import java.util.*;
public class printprime {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
		boolean prime;
		for(int i=2; i<=n; i++)
			{
				prime = true;
				for(int j=2; j<i; j++)
					{
						if(i%j==0)
						{
						prime = false;
						break;
						}
					}
		if(prime)
		{
			System.out.println(i);
		}
	}
    }
}
