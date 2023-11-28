public class factorial {

    public static void main(String args[]) {
        int i, fact = 1;
        int n = 7;// It is the number to calculate factorial
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

}
