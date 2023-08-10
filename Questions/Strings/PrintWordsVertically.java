package Strings;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {
    public static void main(String[] args) {

        System.out.println(printVertically("Poorva is learning DSA"));
    }

    public static List<String> printVertically(String s) {
        String[] str = s.split(" ");
        List<String> list = new ArrayList<>();

        int length = 0;
        for(String st: str){
           if(length < st.length()) length = st.length();
        }


        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            for (String st: str){
                if(i < st.length()) {
                    sb.append(st.charAt(i));
                } else {
                    sb.append(" ");
                }
            }

            list.add(sb.toString().stripTrailing());
        }

        return list;
    }
}
