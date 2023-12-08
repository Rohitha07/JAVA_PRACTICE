/*Write a program to find out the difference between sum of all the elements in two arrays arr1 and arr2.
If sum of all elements in arr1 is larger then, the output should be First array is larger,
if sum of all elements in arr2 is larger then, the output should be Second array is larger,
otherwise the output should be Both are equal. */

import java.io.*;
import java.util.*;
public class array1 {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            
            n = sc.nextInt();
            int []arrA=new int[n];
            for(int i=0;i<n;++i){
                    arrA[i]=sc.nextInt();
            }
            
            n = sc.nextInt();
            int []arrB=new int[n];
            for(int i=0;i<n;++i){
                arrB[i]=sc.nextInt();
            }
            
            System.out.println(ArrayProblem(arrA,arrB)); 
        }
        public static String ArrayProblem(int []arrA,int []arrB){
           // Write code here
            int sumA=0;
            int sumB=0;
            for(int i=0;i<arrA.length;i++)
                {
                    sumA=sumA+arrA[i];
                }
            for(int i=0;i<arrB.length;i++)
                {
                    sumB=sumB+arrB[i];
                }
            if(sumA>sumB)
            {
                return "First array is larger";
            }
            if(sumB>sumA)
            {
                return "Second array is larger";
            }
            else
            {
                return "Both are equal";
            }
        }
    }
}
