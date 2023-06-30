package Graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DFS {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer> list = new ArrayList<>();
       Set<Integer> visited = new HashSet<>();
       dfs(0, adj, visited, list);
        return list;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, Set<Integer> visited, ArrayList<Integer> list){
        visited.add(node);
        list.add(node);

        for(int neigh: adj.get(node)){
            if(!visited.contains(neigh)){
                dfs(neigh, adj, visited, list);
            }
        }
    }
}
