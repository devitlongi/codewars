package sk.longi.exam.codeWars.DetMatrix;


import java.util.Arrays;

public class detMatrix {
    static int[][]m = {{2,5,3}, {1,-2,-1}, {1, 3, 4}};


    static public long determinant(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix));
            int a =0;

            if (matrix[0].length == 1) return matrix[0][0];
            if (matrix[0].length == 2) return (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
            int[][] met = new int[matrix[0].length - 1][matrix[0].length - 1];

            int p = 0;
            for (int k = 0; k < matrix.length; k++) {
                for (int i = 1; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {

                        if ((k != j) && (i != 0) && (j > k)) met[i - 1][j - 1] = matrix[i][j];
                        if ((k != j) && (i != 0) && (j < k)) met[i - 1][j] = matrix[i][j];
                    }
                }
                p=k;
            }
            a += ((p+2 ) % 2 == 0) ? matrix[0][p] * determinant(met) : (-1) * matrix[0][p] * determinant(met);

            return a;

    }
    public static void main(String[] args) {
try{
            System.out.println(determinant(m));
        }
           catch(Throwable vynimka){
                   System.out.println(vynimka);
                   vynimka.printStackTrace();

        }

    }
}


