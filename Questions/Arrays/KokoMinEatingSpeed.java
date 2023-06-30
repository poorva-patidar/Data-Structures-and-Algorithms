package Arrays;

public class KokoMinEatingSpeed {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        System.out.println(minEatingSpeed(piles, 8));
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = piles[0];

        for(int i = 1; i < piles.length; i++){
            if(end < piles[i]){
                end = piles[i];
            }
        }
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(!check(piles, mid, h)){
                start = mid + 1;
            }else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean check(int[] piles, int mid, int h) {
        double hr = 0;
        for(int i = 0; i < piles.length; i++){
            hr += Math.ceil((double) piles[i] / (double) mid);
        }

        if(hr > h){
            return false;
        }

        return true;
    }
}
