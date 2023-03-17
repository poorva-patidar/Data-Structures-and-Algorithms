package Recursion;

public class NTo1 {
    public static void main(String[] args) {
        int num = 5;
        func(num);
        func1(num);
    }

    // N to 1
    private static void func(int n) {
        if(n == 0)
            return;

        func(n - 1);
        System.out.println(n);
    }

    // 1 to N
    private static void func1(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        func1(n - 1);
    }
}
