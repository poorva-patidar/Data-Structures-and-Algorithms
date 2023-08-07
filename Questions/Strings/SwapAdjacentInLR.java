package Strings;

public class SwapAdjacentInLR {

    public static void main(String[] args) {
        System.out.println(canTransform("RXXLRSDXRXL", "XRLXXRRLX"));
    }
    public static boolean canTransform(String start, String end) {
        int i = 0;
        int j = 0;
        char[] st = start.toCharArray();
        char[] en = end.toCharArray();
        int length = start.length();

        while (i < length || j < length) {

            while (i < length && st[i] == 'X') {
                i++;
            }

            while (j < length && en[j] == 'X') {
                j++;
            }

            if (i == length || j == length) {
                break;
            }

            if ((st[i] != en[j]) || (st[i] == 'L' && j > i) || (st[i] == 'R' && j < i)) {
                return false;
            }

            i++;
            j++;

        }

        return i == j;
    }
}
