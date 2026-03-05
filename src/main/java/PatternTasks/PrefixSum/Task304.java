package PatternTasks.PrefixSum;

public class Task304 {


    class NumMatrix {
        int[][] matrixObj;

        public NumMatrix(int[][] matrix) {
            matrixObj = new int[matrix.length+1][matrix[0].length+1];
            for (int i = 1; i <= matrix.length; i++) {
                for (int j = 1; j <= matrix[0].length; j++) {
                    matrixObj[i][j] = matrix[i-1][j-1] - matrixObj[i-1][j-1] + matrixObj[i][j-1] + matrixObj[i-1][j];
                }
            }
        }

//        sum = pref[row2+1][col2+1]   // вся большая область
//                - pref[row1][col2+1]     // вычитаем сверху
//                - pref[row2+1][col1]     // вычитаем слева
//                + pref[row1][col1];      // возвращаем угол

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return matrixObj[row2+1][col2+1] - matrixObj[row1][col2+1] - matrixObj[row2+1][col1] + matrixObj[row1][col1];
        }
    }

}
