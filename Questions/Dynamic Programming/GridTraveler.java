package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {
    public static void main(String[] args) {
        System.out.println(gridTravelerDP(18, 18));
    }

    /**
     * Brute force approach with 0(2^(m + n)) Time complexity and O(m + n) Space complexity
     */
    private static int gridTraveler(int m, int n) {

        if(m == 1 && n == 1) return 1;
        if(m == 0 || n == 0) return 0;

        return gridTraveler(m - 1, n) + gridTraveler(m, n - 1);
    }

    /** Now optimized approach to solve this question using dynamic programming with a time complexity of O(m * n) and
     * space complexity of O(m + n). Here memoization is used
     */
    public static long gridTravelerDP(int m, int n){
        Map<String, Long> map = new HashMap<>();
        return gridTravelerDP(m, n, map);
    }

    private static long gridTravelerDP(int m, int n, Map<String, Long> map) {
        String str = m + "," + n;

        if(map.containsKey(str)) return map.get(str);
        if(m == 1 && n == 1) return 1;
        if(m == 0 || n == 0)  return 0;

        map.put(str, gridTravelerDP(m - 1, n, map) + gridTravelerDP(m, n - 1, map));
        return map.get(str);
    }

}
