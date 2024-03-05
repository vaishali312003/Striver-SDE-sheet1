import java.util.Scanner;

public class firstpart2{

    public static int[][] markrow(int i, int row, int[][] matrix){
        for(int j = 0; j < row; j++){
            if(matrix[i][j] != 0)
                matrix[i][j] = -1;
        }
        return matrix;
    }

    public static int[][] markcol(int j, int col, int[][] matrix){
        for(int i = 0; i < col; i++){
            if(matrix[i][j] != 0)
                matrix[i][j] = -1;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[row][col];

        // Input matrix values
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print original matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Mark rows and columns containing zeros
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix = markrow(i, row, matrix);
                    matrix = markcol(j, col, matrix);
                }
            }
        }

        // Reset -1 values back to 0
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }

        // Print modified matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
