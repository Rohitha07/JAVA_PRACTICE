//Calculate the ratios of its elements that are positive, negative, and zero to the array size N.

import java.util.Scanner;
public class plusminus {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// STEP 1 Taking input From the user 
		int size = in.nextInt();
		
		// STEP 2 Input the values into the array 
		int arr[] = new int[size];
		for(int i=0;i<size;i=i+1)
		{
		    arr[i] = in.nextInt();
		}
		
		// STEP 3 Count number of pairs which are which have difference of k 
		
		double countOfPositive = 0.0;
		double countOfNegative = 0.0;
		double countOfZero = 0.0;
		
		for(int i=0;i<=(size-1);i=i+1)
		{
		    if(arr[i]>0)
		    {
		        countOfPositive = countOfPositive + 1.0;
		    }
		    else if(arr[i]<0)
		    {
		        countOfNegative = countOfNegative + 1.0;
		    }
		    else
		    {
		        countOfZero = countOfZero + 1;
		    }
		}
		
		double ratioOfPositiveNumber = countOfPositive/size;
		double ratioOFNegativeNumber = countOfNegative/size;
		double ratioOfZeroNumber = countOfZero/size;
		
		// printf is used to print required number of digits after decimal point 
// %.numberOfDigitsWeWantAfterDecimal
		System.out.printf("%.6f\n", ratioOfPositiveNumber);
		System.out.printf("%.6f\n", ratioOFNegativeNumber);
		System.out.printf("%.6f\n", ratioOfZeroNumber);
    }
}
