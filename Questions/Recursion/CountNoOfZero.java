package Recursion;

public class CountNoOfZero {
    public static void main(String[] args) {
        int c = 0;
        System.out.println(countZeros(2000407, c));
    }

    private static int countZeros(int i, int c) {

        if(i == 0){
            return c;
        }

        int rem = i % 10;

        if(rem == 0){
            return countZeros(i / 10, c + 1);
        } else{
            return countZeros(i / 10, c);
        }
    }
}
