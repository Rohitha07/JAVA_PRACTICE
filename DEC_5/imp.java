//If the number is less than 30 then "less important" will be printed. If the number is not less than 30 then "more important" will be printed.

import java.util.Scanner;
public class imp {
    public static void main(String args[])
{
int N;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
if(N<30)
{
System.out.println("less important");
}
else{
System.out.println("more important");
}
}
}
