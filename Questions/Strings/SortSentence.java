package Strings;


import java.util.HashMap;
import java.util.Map;

public class SortSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 a3 Sentence4 This1"));
    }
    public static String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();
        int j  = 0;

        for(int i = 0; i < s.length(); i++){
            int a = s.charAt(i) - '0';

            if(a >= 1 && a <= 9){
                map.put(a, s.substring(j, i));
                j = i + 2;
                i = i + 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10; i++){
            if(map.isEmpty()) break;

            if(map.containsKey(i)){
                if(map.size() == 1){
                    sb.append(map.get(i));
                } else{
                    sb.append(map.get(i) + " ");
                }
                map.remove(i);
            }
        }



        return sb.toString();

    }
}
