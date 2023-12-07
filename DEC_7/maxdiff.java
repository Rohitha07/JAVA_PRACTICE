// maximum difference between any two element in an array.
import java.io.*;
import java.util.*;
public class maxdiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        ArrayProblem(arr);  
    }
    
    public static void ArrayProblem(int arr[]) {
        // When array size is not given 
        // arr.length --> size of the array 
        
        int n = arr.length; // inbuilt function (automatically give you the length)
        
        // STEP 1 (Find largest element)
        // 17th Feb 
        
        int largestElement = arr[0];
        // largestElement = 5
        // STEP 1) i=0, arr[i] = 5, 5>5 (False), largestElement = 5
        // STEP 2) i=1, arr[i] = 1, 1>5 (False), largestElement = 5
        // STEP 3) i=2, arr[i] = 2, 2>5 (False), largestElement = 5
        // STEP 4) i=3, arr[i] = 7, 7>5 (True), largestElement = 7
        // STEP 5) i=4, arr[i] = 10, 10>7 (True), largestElement = 10
        // STEP 6) i=5, arr[i] = 4, 4>10 (False), largestElement = 10 
        // STEP 7) i=6, arr[i] = 10, 10>10 (False), largestElement = 10 
        for(int i=0; i<n; i=i+1)
        {
            if(arr[i] > largestElement)
            {
                largestElement = arr[i];
            }
        }

        // STEP 2 (Find Smallest element)
        int smallest = arr[0];
        for(int i=0; i<n; i=i+1)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        
        // STEP 3 (Print largest - smallest (This will be the maximum difference))
        System.out.println(largestElement - smallest);
    }
}
