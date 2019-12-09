package leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P73 {

    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;

        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();

        for (int ri = 0; ri < matrix.length; ++ri) {
            for (int ci = 0; ci < matrix[0].length; ++ci) {
                if (matrix[ri][ci] == 0) {
                    rows.add(ri);
                    columns.add(ci);
                }
            }
        }

        for (int ri = 0; ri < matrix.length; ++ri) {
            for (int ci = 0; ci < matrix[0].length; ++ci) {
                if (rows.contains(ri) || columns.contains(ci)) {
                    matrix[ri][ci] = 0;
                }
            }
        }
    }
}
