package leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P118 {

    public List<List<Integer>> generate(int numRows) {
        if (numRows < 0) throw new IllegalArgumentException("numRows is negative");
        if (numRows == 0) return new ArrayList<>(0);

        List<List<Integer>> rv = new ArrayList<>(numRows);

        // process first row
        rv.add(Collections.singletonList(1));

        for (int ri = 1; ri < numRows; ++ri) {
            List<Integer> row = new ArrayList<>(ri + 1);
            // column 0 is always 1
            row.add(1);

            List<Integer> prev = rv.get(ri-1);

            for (int ci = 1; ci < ri; ++ci) {
                row.add(prev.get(ci - 1) + prev.get(ci));
            }

            // last column is 1
            row.add(1);

            rv.add(row);
        }

        return rv;
    }
}
