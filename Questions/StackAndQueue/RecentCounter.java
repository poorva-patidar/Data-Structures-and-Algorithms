package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        int till_time = t - 3000;
        if(till_time < 0){
            return queue.size();
        }

        while(!queue.isEmpty() && queue.peek() < till_time){
            queue.remove();
        }

        return queue.size();
    }
}
