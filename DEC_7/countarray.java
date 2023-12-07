//count the elements in an array which are greater than 35.
public class countarray {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem2(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem2(int n, int[] arr){
        // Write code here
		int max = 35;
		int count = 0;
		for(int i=0;i<n;i++)
			{
				if(arr[i]>max)
				{
					count++;
				}
			}
		return count;
    }
}
