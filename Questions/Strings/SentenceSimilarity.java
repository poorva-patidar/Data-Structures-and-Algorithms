package Strings;

public class SentenceSimilarity {
    public static void main(String[] args) {
        System.out.println(areSentencesSimilar("My Name Is POORVA", "my name poorva"));
    }
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int len1 = s1.length;
        int len2 = s2.length;

        int i = 0;
        int j = 0;
        while(i < len1 && j < len2){
            if(!s1[i].equals(s2[j])){
                break;
            }
            i++;
            j++;
        }

        if(i == len1 || j == len2) return true;

        while (len1 > i && len2 > j){
            if(!s1[len1 - 1].equals(s2[len2 - 1])) return false;
            len1--;
            len2--;
        }

        return len1 - 1 < i || len2 - 1 < j ;
    }
}
