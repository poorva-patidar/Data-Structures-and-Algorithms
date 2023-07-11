package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    public static long fibo(int n) {
        Map<Long, Long> map = new HashMap<>();
        return fibo(n, map);
    }

    private static long fibo(long n, Map<Long, Long> map) {
        // To check whether the value for this n is already calculated or not
        // n is used as keys
        // and values are used to store their calculated values
        if(map.containsKey(n)){
            return map.get(n);
        }


        //Base Case
        //Still have to calculate once
        if(n <= 2){
            return 1;
        }

        // we checked that if n already exits in map or not
        // Now if not then we will store its value
        map.put(n, fibo(n - 1, map) + fibo(n - 2, map));
        return map.get(n);
    }
}
