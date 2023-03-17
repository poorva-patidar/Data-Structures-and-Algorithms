package Recursion;

public class GeekonacciNumber {
    public static void main(String[] args) {
        int A = 1, B = 3, C = 2;
        int n = 6;
        int ans = gN(A, B, C, n);
        System.out.println(ans);
    }

    private static int gN(int a, int b, int c, int n) {
         // Base condition
        if(n == 1)
           return a;
        if(n == 2)
            return b;
        if(n == 3)
            return c;
        return gN(a, b, c,n - 1) + gN(a, b, c, n - 2) + gN(a, b, c, n - 3);
    }
}
