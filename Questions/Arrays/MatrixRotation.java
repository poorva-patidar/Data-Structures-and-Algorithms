package Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {1, 1},
                {0, 1}

        };
        int[][] target = new int[][]{
                {1, 1},
                {1, 0}
        };
        System.out.println(findRotation(mat, target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        boolean check = true;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(mat[i][j] != target[i][j]){
                    check = false;
                    break;
                }
            }
        }

        if(!check){
            check = true;
            // Column are increasing in outer and row is decreasing in inner loop
            for(int j = 0, r = 0; j < mat.length; j++, r++){
                for(int i = mat.length - 1, c = 0; i >= 0; i--, c++){
                    if(mat[i][j] != target[r][c]){
                        check = false;
                        break;
                    }
                }
            }
        }

        if(!check){
            check = true;
            // Row is decreasing in the outer loop and the column is increasing in the inner loop
            for(int i = mat.length - 1, r = 0; i >= 0; i--, r++){
                for(int j = mat.length - 1, c = 0; j >= 0; j--, c++){
                    if(mat[i][j] != target[r][c]){
                        check = false;
                        break;
                    }
                }
            }
        }

        if(!check){
            check = true;
            // Row is decreasing in the outer loop and the column is increasing in the inner loop
            for(int i = mat.length - 1, r = 0; i >= 0; i--, r++){
                for(int j = 0, c = 0; j < mat.length; j++, c++){
                    if(mat[j][i] != target[r][c]){
                        check = false;
                        break;
                    }
                }
            }
        }

        return check;
    }


}
