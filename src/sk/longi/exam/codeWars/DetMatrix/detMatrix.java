package sk.longi.exam.codeWars.DetMatrix;


import java.util.Arrays;

public class detMatrix {
    static int[][] m = {{6, -6, -10, 9, -3, 5, -4, 3},{-5, -7, -4, -8, -3, -6, 7, 0},{5, 4, -1, -9, -8, 8, -2, 4},{-4, -3, 9, 3, 3, -9, 5, 3},{7, 2, 3, -8, 5, -10, 4, 0},{-8, -8, 4, 5, 3, 0, 1, -4},{-1, -3, 0, -3, 4, -1, 7, -8},{4, 0, -2, -10, -7, -1, 0, 0}};
    static long a=0;

    static public long determinant(int[][] matrix) {
//        for (int g =0;g<matrix.length;g++){
//            System.out.print(Arrays.toString(matrix[g]).replace('[','{').replace(']','}')+",");
//        }
//        System.out.println();
        if(matrix[0].length == 1) return matrix[0][0];
        if (matrix[0].length == 2) return (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
        int[][] met = new int[matrix[0].length - 1][matrix[0].length - 1];
        int i = 0;
        int j = 0;
        int k = 0;
        for (k = 0; k < matrix.length; k++) {
            for (i = 1; i < matrix.length; i++) {
                for (j = 0; j < matrix.length; j++) {
                    if ((k != j) && (i != 0)&&(j>k)) met[i-1][j-1] = matrix[i][j];
                    if ((k != j) && (i != 0)&&(j<k)) met[i-1][j] = matrix[i][j];
                }
            }
            System.out.println(a);
            a += ((k+2) % 2 == 0) ? matrix[0][k] * determinant(met) : (-1)*matrix[0][k] * determinant(met);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(determinant(m));
    }
}


