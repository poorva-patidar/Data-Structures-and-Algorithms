package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }

    private static int factorial(int n) {

        if(n < 2)
            return n;

        return n * factorial(n - 1);

    }
}
