import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quotient, i = 0;
        int[] binary_num = new int[100];

        System.out.print("Enter the decimal number: ");
        int num = in.nextInt();

        quotient = num;
        while(quotient != 0){
             binary_num[i] = quotient % 2;
             quotient /= 2;
             i += 1;
        }

        for(int j = i - 1; j >= 0; j--){
            System.out.print(binary_num[j]);
        }
    }
}
