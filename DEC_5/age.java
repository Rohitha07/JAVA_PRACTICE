//if the input number is 28, print i am young.
//else print i am not young.


import java.io.*;
import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        // write code here
        switch (n) 
		{
             case 28:
                System.out.println("i am young");
                break;
			 default:
                System.out.println("i am not young");
                break;
		}
    }
}
