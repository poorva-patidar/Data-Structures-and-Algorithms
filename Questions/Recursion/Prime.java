package Recursion;

public class Prime {
    public static void main(String[] args) {
        int n = 0;
        prime(n, 2);
    }

    private static void prime(int n, int i) {

        if( i * i >= n) {
            System.out.println("prime");
            return;
        }

        if(n % i == 0 || n == 1)
            System.out.println("Not prime");
        else
            prime(n,i + 1);
    }
}
