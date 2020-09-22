package practiceCode;

public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        boolean fc = false;
        boolean fr = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        fr = true;
                    else if (j == 0)
                        fc = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (fr) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[0][j] = 0;
            }

            if (fc) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }
}
