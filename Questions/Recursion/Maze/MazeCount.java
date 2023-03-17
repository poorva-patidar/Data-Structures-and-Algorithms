package Recursion.Maze;

public class MazeCount {
    public static void main(String[] args) {
        System.out.println(countM(3, 3));
    }

    private static int countM(int row, int col) {
        if(row == 1 || col == 1){
            return 1;
        }

        return countM(row - 1, col) + countM(row, col - 1);
    }
}
