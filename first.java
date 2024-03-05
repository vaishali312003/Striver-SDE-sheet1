import java.util.Scanner;

public class first {
    public void func(int matrix[][], int row, int col) {
        int[][] var = new int[row][col];
        int r=0;
        int c=0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               var[i][j]=matrix[i][j];
            }
            
        }
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0)
                for(int k=0;k<col;k++){
                    var[k][j]=0;
                    var[i][k]=0;
                   }
                   
                
            }

        }
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(var[i][j] + " ");
            }
            System.out.println(); // Add this line to move to the next line after each row
        }
    
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        first obj = new first();
        obj.func(matrix, row, col);
    }
}
