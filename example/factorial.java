
public class factorial {
   public static void main(String[] args) {
      int n = 20;          // To compute factorial of n
      long factorial = 1;   // Init the product to 1
 
      int i = 1;
      while (i <= n) {
         factorial = factorial * i;
         i++;
      }
      System.out.println("The Factorial of " + n + " is " + factorial);
   }
}