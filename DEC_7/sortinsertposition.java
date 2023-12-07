//Print the index where the element is present. If it's not present, print the index it would be inserted into the sorted array.

import java.io.*;
import java.util.*;
public class sortinsertposition {
    public static int searchInsert(int[] a, int b) {
        
        int n = a.length;
        int index = -1;
        
        for(int i=0; i<n; i=i+1)
        {
            if(a[i] == b || b<a[i])
            {
                index = i;
                break;
            }
        }

		if(index == -1)
		{
			index = n;
		}
        return index;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(searchInsert(A,B));
    }
}
