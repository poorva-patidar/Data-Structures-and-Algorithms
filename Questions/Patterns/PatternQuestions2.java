package Patterns;

public class PatternQuestions2 {
    public static void main(String[] args) {
        pattern17(5);
    }

    public static void pattern28(int n){
        for (int row = 1; row <  2 * n; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            int spaces = n - totalCols;
            for (int col = 0; col < totalCols + spaces; col++) {
                if(col < spaces){
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }



    public static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for(int col = 0; col < spaces; col++){
                System.out.print("  ");
            }

            for(int col = row; col > 0; col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for (int row = 1; row < 2 * n; row++) {
            int spaces = n - row;
            int c = row > n ? 2 * n - row: row;
            for(int col = 0; col < n - c; col++){
                System.out.print("  ");
            }

            for(int col = c; col > 0; col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col <= c; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
