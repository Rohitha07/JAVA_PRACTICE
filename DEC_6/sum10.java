//Write a program to calculate the sum of first 10 natural number.

import java.util.*;
public class sum10 {
    public static void main(String[] args) throws Throwable {
        int sum=0;
		for(int i=1;i<11;i++)
			sum+=i;
		System.out.print(sum);
    }
}
