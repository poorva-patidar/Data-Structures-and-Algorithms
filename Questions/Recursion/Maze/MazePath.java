package Recursion.Maze;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
//        mazePath("", 3, 3);
//        System.out.println(mazePathRet("" , 3, 3));
        System.out.println(mazePathDiagonal("", 3, 3));
    }

    private static void mazePath(String s, int row, int col) {
        if(row == 1 && col == 1){
            System.out.println(s);
            return;
        }

        if(row > 1){
            mazePath(s + "D", row - 1, col);
        }

        if(col > 1){
            mazePath(s + "R", row, col - 1);
        }
    }


    // Returning the maze Paths in an arrayList
    private static ArrayList<String> mazePathRet(String s, int row, int col) {
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row > 1) {
            list.addAll(mazePathRet(s + "D", row - 1, col));
        }

        if(col > 1){
            list.addAll(mazePathRet(s + "R", row, col - 1));
        }

        return list;
    }

    private static ArrayList<String> mazePathDiagonal(String s, int row, int col) {
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(row > 1 && col > 1){
            list.addAll(mazePathDiagonal(s + "D", row - 1, col - 1));
        }

        if(row > 1) {
            list.addAll(mazePathDiagonal(s + "V", row - 1, col));
        }

        if(col > 1){
            list.addAll(mazePathDiagonal(s + "H", row, col - 1));
        }

        return list;
    }
}
