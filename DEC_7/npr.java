//calculate nPr n!/(n-r)!.

import java.util.*;
public class npr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
     }
     public static int fact(int f)
        {
            int fact=1;
            while(f!=0)
                {
                    fact=fact*f;
                    f--;
                }
            return fact;
        }
     public static int getValueInBase(int n, int r){
      // Your code here
         int nFact = fact(n);
         int rFact = fact(n-r);
         
         return nFact/rFact;
     }
}
