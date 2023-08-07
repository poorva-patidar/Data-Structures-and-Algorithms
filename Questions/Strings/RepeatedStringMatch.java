package Strings;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("abcd" , "cdabcdab"));
    }
    public static int repeatedStringMatch(String a, String b) {
        int i = 0;
        StringBuilder str = new StringBuilder();

        while(i < b.length() / a.length() + 2){
            str.append(a);
            if(str.toString().contains(b)){
                return i + 1;
            }
            i++;
        }

        return -1;
    }
}
