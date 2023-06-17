import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = in.nextLine();
        String revStr = "";

        for(int i = str.length() - 1; i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }


        System.out.println(revStr);
    }
}
