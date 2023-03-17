package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int num = 100;
        int ans = sumDigit(num);

        System.out.println(ans);
    }

//    private static int sumOfDigit(int num, int sum) {
//        if(num < 1)
//            return sum;
//
//        sum = sum + (num % 10);
//        num = num / 10;
//
//        return sumOfDigit(num, sum);
//    }

    public static int sumDigit(int num){
        if(num == 0)
            return 0;

        return num % 10 + sumDigit(num / 10);
    }
}
