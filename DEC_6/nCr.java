//nCr = (n!) / (r! * (n-r)!)  where n! = 1 * 2 * . . . * n.
public class nCr {
    static long fact(int n)
	{
		long fact=1;
		while(n!=0)
			{
				fact*=n;
				n--;
			}
		
		return fact;
	}
	
    static long calculate_nCr(int n, int r) {
        // write code here
		long ans = fact(n)/(fact(r)*fact(n-r));
		return ans;
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long ans = calculate_nCr(n,r);
        System.out.print(ans);
    }
}
