//Return the number of consecutive pairs whose sum will be equal to k.

import java.io.*;
import java.util.*;
public class consecutivepairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
		int count = 0;
		for(int i=0;i<arr.length-1;i++)
			{
				if((arr[i]+arr[i+1])==k)
					count++;
			}
        System.out.println(count); 
    }
}
