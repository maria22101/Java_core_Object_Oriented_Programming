package edx_javacore_2_module_1;
import java.util.Arrays;

//Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters,
// treats the arrays as 2D matrices and adds them, returning the result.
// The sum of two matrices A and B is a matrix C where for every row i and column j, Cij = Aij + Bij.
// You may assume that the arrays passed as parameters have the same dimensions.

public class Arrays2D {

   static int[][] matrixAdd(int matrixA[][], int matrixB[][]) {
        int matrixC [][];
        if (matrixA.length != 0 && matrixB.length != 0) {
            matrixC = new int[matrixA.length][matrixA[0].length];
            for(int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
        }else if (matrixA.length == 0 && matrixB.length == 0) {
            matrixC = new int[0][0];
        }else if (matrixB.length == 0) {
            matrixC = new int[matrixA.length][matrixA[0].length];
            for(int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    matrixC[i][j] = matrixA[i][j];
                }
            }
        }else{
            matrixC = new int[matrixB.length][matrixB[0].length];
            for(int i = 0; i < matrixB.length; i++) {
                for (int j = 0; j < matrixB[i].length; j++) {
                    matrixC[i][j] = matrixB[i][j];
                }
            }
        }
        return matrixC;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{2,2,2},{1,1,1}};
        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrixAdd(a,b)));
    }
}
