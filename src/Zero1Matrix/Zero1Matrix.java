package Zero1Matrix;

import java.util.Arrays;

public class Zero1Matrix {
    public static int[][] updateMatrix(int[][] mat){
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] distanceMatrix = new int[rows][cols];
        for(int[] row : distanceMatrix){
            Arrays.fill(row, Integer.MAX_VALUE - 100000);
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(mat[i][j] == 0){
                    distanceMatrix[i][j] = 0;
                }else{
                    if(i > 0){
                        distanceMatrix[i][j] = Math.min(distanceMatrix[i][j], distanceMatrix[i - 1][j] + 1);
                    }
                    if (j > 0){
                        distanceMatrix[i][j] = Math.min(distanceMatrix[i][j], distanceMatrix[i][j - 1] + 1);
                    }
                }
            }
        }

        for(int i = rows - 1; i >= 0; i--){
            for(int j = cols- 1; j >= 0; j--){
                if(i < rows - 1){
                    distanceMatrix[i][j] = Math.min(distanceMatrix[i][j], distanceMatrix[i + 1][j] + 1);
                }
                if (j < cols - 1){
                    distanceMatrix[i][j] = Math.min(distanceMatrix[i][j], distanceMatrix[i][j + 1] + 1);
                }
            }
        }

        return distanceMatrix;
    }
}
