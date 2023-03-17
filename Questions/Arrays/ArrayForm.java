package Arrays;

/* Question: */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayForm {

        public static void main(String[] args) {
             int[] arr = {9, 9, 9, 9, 9};
            System.out.println(addToArrayForm(arr, 1));
        }


        public static List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> list = new ArrayList<Integer>();
            int sum = k;
            int i = num.length - 1;

            while(i >= 0 || sum > 0){
                if(i >= 0){
                    sum = sum + num[i];
                }
                list.add(sum % 10);
                sum = sum / 10;
                i = i - 1;
            }

            Collections.reverse(list);

            return list;


        }

}
