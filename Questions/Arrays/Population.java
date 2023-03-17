package Arrays;

public class Population {
    public int maximumPopulation(int[][] logs) {
        int maxCount = 0;
        int maxYear = 1950;
        int currentSum = 0;
        for(int i = 1950; i <= 2050; i++){
            currentSum = 0;
            for(int[] person: logs){
                if(i >= person[0] && i < person[1]){
                    currentSum++;
                }
            }

            if(maxCount < currentSum){
                maxCount = currentSum;
                maxYear = i;
            }
        }

        return maxYear;
    }
}
