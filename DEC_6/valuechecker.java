//Print Yes if the second last place value is 0 else No.
import java.util.*;
public class valuechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean res = determineSecondLastDigit(n);
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean determineSecondLastDigit(int n) {
        // write code here
		int reminder = 0;
		boolean res;
		for(int i=1; i<=2; i++)
			{
				reminder = n%10;
				n = n/10;
				if(i==1){reminder=0;}
			}
		if(reminder ==0)
		{
			res = true;
		}
		else
		{
			res = false;
		}
		return res;
    }
}
