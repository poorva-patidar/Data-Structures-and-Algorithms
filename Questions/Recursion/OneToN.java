package Recursion;

// Write numbers from 1 to n without using loops
public class OneToN {

    public static void main(String[] args) {
         int n = 10;
         oneToN(n);
    }

    private static void oneToN(int n) {
        if(n < 1)
            return;
        oneToN(n - 1);
        System.out.print(n + " ");
    }
}
