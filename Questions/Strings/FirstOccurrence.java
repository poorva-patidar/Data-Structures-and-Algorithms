package Strings;

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println(strStr("sad", "sad"));
    }
    public static int strStr(String haystack, String needle) {
        int i = 0;
        int j = needle.length();
        int k = 0;

        while(k < haystack.length()){
            k = i + j;
            if(k <  haystack.length()){
                String str = haystack.substring(i, k);
                if(str.equals(needle)){
                    return i;
                } else {
                    i++;
                }
            }
        }

        return -1;

    }
}
