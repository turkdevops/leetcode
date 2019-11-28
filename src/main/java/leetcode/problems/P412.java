package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P412 {

    public List<String> fizzBuzz(int n) {
        if (n < 0) throw new IllegalArgumentException("n should be negative");

        if (n == 0) return new ArrayList<>(0);

        List<String> rv = new ArrayList<>(n);

        for (int v = 1; v <= n; ++v) {
            if (v % 15 == 0) {
                rv.add("FizzBuzz");
            }
            else if (v % 5 == 0) {
                rv.add("Buzz");
            }
            else if (v % 3 == 0) {
                rv.add("Fizz");
            }
            else {
                rv.add(String.valueOf(v));
            }
        }

        return rv;
    }
}
