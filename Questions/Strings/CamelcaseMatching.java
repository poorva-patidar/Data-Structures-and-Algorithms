package Strings;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public static void main(String[] args) {
        String[] queries = {"CompetitiveProgramming","CounterPick","ControlPanel"};
        System.out.println(camelMatch(queries, "CooP"));
    }

    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        char[] p = pattern.toCharArray();

        for(int k = 0; k < queries.length; k++){
            char[] q = queries[k].toCharArray();

            while (i < q.length && j < p.length){
                    if(q[i] == p[j]){
                        i++;
                        j++;
                    } else {
                        if(q[i] >= 65 && q[i] <= 90){
                            break;
                        }

                        i++;
                    }
            }

            if(j == p.length){
                boolean check = true;
                while (i < q.length){
                    if(q[i] >= 65 && q[i] <= 90){
                        list.add(false);
                        check = false;
                        break;
                    }
                    i++;
                }

                if(check){
                    list.add(true);
                }
            } else {
                list.add(false);
            }

            j = 0;
            i = 0;

        }


        return list;
    }
}
