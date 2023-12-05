//Verify if (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.

import java.util.*;

public class verifycube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long lhs = (a*a*a)+(3*(a*a*b))+(3*(a*b*b))+(b*b*b);
		long rhs = (a*a*a)+(b*b*b)+(3*a*a*b)+(3*a*b*b);
        System.out.println(lhs);
	    System.out.println(rhs);
		if(lhs==rhs){
			
			System.out.println("VERIFIED");
			}else {
			System.out.println("NOT VERIFIED");
			}
	}
}
