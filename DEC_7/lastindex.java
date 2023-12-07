//Print the last index of the key in the array.

import java.util.*;
public class lastindex {
    public static void findIndex(int key, int[] arr) {
        //Your code goes here
		int i;
		for(i=arr.length-1;i>=0;i--)
			{
				if(arr[i]==key)
					break;
			}
		System.out.print(i);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        findIndex(key, arr);
        sc.close();
    }
}
