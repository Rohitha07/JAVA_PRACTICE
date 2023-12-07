//Return the shortest distance if more than one even positive integer is present or return -1 if only one or no even positive integer is present.

import java.util.*;
public class shortdistance {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }

		public static int ArrayProblem6(int n, int[] arr){
        int min=Integer.MAX_VALUE,ct=0;int p=0;
		for(int i=0;i<n;++i){
			if(arr[i]>=0&&arr[i]%2==0){
				ct=i+1;
				min=Math.min(ct-p,min);
				p=ct;
			}
            
        }
		if(ct==0 ) return -1;
		else return min;
    }
}
