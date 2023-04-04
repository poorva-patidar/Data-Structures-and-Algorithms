package Arrays;

public class MoveChips {
    public static void main(String[] args) {
        int[] arr = {1, 1000000000};
        System.out.println(minCostToMoveChips(arr));
    }
    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int ele: position){
            if(ele % 2 == 0){
                even++;
            } else{
                odd++;
            }
        }

        return Math.min(odd, even);
    }
}
