public class palindromenum {

  public static void main(String args[]) {
    int i, sum = 0, temp;
    int num = 232;// It is the number variable to be checked for palindrome

    temp = num;
    while (num > 0) {
      i = num % 10; // getting remainder
      sum = (sum * 10) + i;
      num = num / 10;
    }
    if (temp == sum)
      System.out.println("num is palindrome number ");
    else
      System.out.println("num is not palindrome");
  }
}
