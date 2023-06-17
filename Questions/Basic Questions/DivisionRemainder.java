import java.util.Scanner;

public class DivisionRemainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num2 != 0){
            System.out.println("Division: " + num1 / num2);
        }

        System.out.println("Remainder: " + num1 % num2);
    }
}
