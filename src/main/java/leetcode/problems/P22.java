package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P22 {

    public List<String> generateParenthesis(int n) {
        if (n <= 0) return new ArrayList<>(0);

        List<String> parenthesis = new ArrayList<>();
        backtrace(parenthesis, "", 0, 0, n);
        return new ArrayList<>(parenthesis);
    }

    private void backtrace(List<String> parenthesis, String current, int left, int right, int max) {
        if (current.length() == 2 * max) {
            parenthesis.add(current);
        }
        else {
            if (left < max) {
                backtrace(parenthesis, current + "(", left + 1, right, max);
            }

            if (right < left) {
                backtrace(parenthesis, current + ")", left, right + 1, max);
            }
        }
    }
}
