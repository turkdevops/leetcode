package leetcode.problems;

public class P73 {

    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;

        int rowSize = matrix.length;
        int columnSize = matrix[0].length;

        boolean[] zeroRows = new boolean[rowSize];
        boolean[] zeroColumns = new boolean[columnSize];

        for (int ri = 0; ri < rowSize; ++ri) {
            for (int ci = 0; ci < columnSize; ++ci) {
                if (matrix[ri][ci] == 0) {
                    zeroRows[ri] = true;
                    zeroColumns[ci] = true;
                }
            }
        }

        for (int ri = 0; ri < matrix.length; ++ri) {
            for (int ci = 0; ci < matrix[0].length; ++ci) {
                if (zeroRows[ri] || zeroColumns[ci]) {
                    matrix[ri][ci] = 0;
                }
            }
        }
    }
}
