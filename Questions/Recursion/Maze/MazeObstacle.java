package Recursion.Maze;

import java.util.ArrayList;

public class MazeObstacle {
    public static void main(String[] args) {
        Boolean[][] obstacle = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        mazeObstacle("",obstacle, 0, 0);
    }

    private static void mazeObstacle(String s, Boolean[][] obstacle, int row, int col) {
        if(row == obstacle.length - 1 && col == obstacle[0].length - 1){
            System.out.println(s);
            return;
        }

        if(!obstacle[row][col]){
            return;
        }
        if(row < obstacle.length - 1) {
            mazeObstacle(s + "D", obstacle, row + 1, col);
        }

        if(col < obstacle[0].length - 1){
            mazeObstacle(s + "R", obstacle, row, col + 1);
        }

    }
}
