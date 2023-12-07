//count the total pairs of integers that have a difference of K.
public class pairs {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// STEP 1 Taking input From the user 
		int size = in.nextInt();
		int k = in.nextInt();
		
		// STEP 2 Input the values into the array 
		int arr[] = new int[size];
		for(int i=0;i<size;i=i+1)
		{
		    arr[i] = in.nextInt();
		}
		
		// STEP 3 Count number of pairs which are which have difference of k 
		int count = 0;
		for(int i=0;i<=(size-1);i=i+1)
		{
		    int fixedElement = arr[i];
		    for(int j=(i+1);j<size;j=j+1)
		    {
		        if((fixedElement - arr[j] == k) || (arr[j] - fixedElement == k))
		        {
		            // we found out one pair that is having sum divisible by k 
		            count = count + 1;
		        }
		    }
		}
		
		System.out.println(count);
    }
}
