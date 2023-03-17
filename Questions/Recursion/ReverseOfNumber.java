package Recursion;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int num = 1234;
        int arg = (int) Math.log10(num);
        int ans = reverse(num, arg);
        System.out.println(ans);
    }

    private static int reverse(int num, int arg) {
        if(num == 0)
            return 0;

        return (int) ((num % 10) * Math.pow(10, arg) + reverse((num / 10), arg - 1));
    }


}
