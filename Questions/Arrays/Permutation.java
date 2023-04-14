//Build Array from Permutations
import java.util.Arrays;


public class Permutation {
    public static void main(String[] args) {

        int[] num = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(per(num)));

    }
    static int[] per(int[] num){

        int[] ans = new int[num.length];
        for(int i = 0; i < num.length; i++) {
            ans[i] = num[num[i]];
        }
        return ans;
    }

}
