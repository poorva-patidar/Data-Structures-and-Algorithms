package Recursion;

public class NaturalSum {

      public static void main(String[] args) {
            int n = 4;
            int ans = naturalSum(n);
            System.out.println(ans);
      }
      private static int naturalSum(int n){

            if (n < 2)
                  return n;

            return  n + naturalSum(n - 1);
      }
}
