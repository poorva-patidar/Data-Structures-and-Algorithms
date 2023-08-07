package Strings;

import java.util.HashMap;
import java.util.Map;

public class DecryptString {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("1326#"));
    }
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 2;
        Map<String, String> map = new HashMap<>();
        char ch = 'a';
        for(int k = 0; k < 26; k++){
            if(k + 1 <= 9){
                map.put(k + 1 + "", (char)(ch + k) + "");
            } else {
                map.put(k + 1 + "#", (char)(ch + k)+ "");
            }
        }

        while(j < s.length()){
            j = i + 2;
            if(j < s.length()){
                char chI = s.charAt(i);
                char chJ = s.charAt(j);
                if(chJ == '#'){
                    sb.append(map.get(s.substring(i, j + 1)));
                    i = j + 1;
                } else{
                    sb.append(map.get(chI + ""));
                    i++;
                }
            }
        }

        while(i < s.length()){
            char chI = s.charAt(i);
            sb.append(map.get(chI + ""));
            i++;
        }

        return sb.toString();

    }
}
