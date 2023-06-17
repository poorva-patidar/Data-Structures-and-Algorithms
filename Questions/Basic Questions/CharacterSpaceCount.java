import java.util.Scanner;

public class CharacterSpaceCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = in.nextLine();

        int characterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for(char ch : str.toCharArray()){
           if(Character.isLetter(ch)){
               characterCount++;
           } else if(Character.isDigit(ch)){
               numberCount++;
           } else if(ch == ' '){
               spaceCount++;
           } else{
               otherCount++;
           }
        }

        System.out.println("Letters: " + characterCount + "  Spaces: " + spaceCount +
                            "  Numbers: " + numberCount + "  Others: " + otherCount);
    }
}
