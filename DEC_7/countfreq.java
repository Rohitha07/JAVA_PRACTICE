//find how many times the digit D appears in the number N.

import java.util.*;
public class countfreq {
    static int countFreqDigit(int n,int d)
    {
        
		int count=0,rem=0;
		while(n!=0)
			{
				rem = n%10;
				if(rem==d)
				{
					count++;
				}
				n/=10;
			}
 
		return count;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int d= sc.nextInt();
        System.out.println(countFreqDigit(n,d));
    }
}
