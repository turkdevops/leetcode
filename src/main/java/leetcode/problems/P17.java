package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P17 {

    private final String[] letters = {
            "", "",
            "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>(0);

        List<String> combinations = new ArrayList<>();
        dfs(combinations, "", digits);

        return combinations;
    }

    private void dfs(List<String> combinations, String combination, String remain) {
        int length = remain.length();
        if (length == 0) {
            combinations.add(combination);
        }
        else {
            int digit = remain.charAt(0) - '0';
            assert digit >= 2 && digit <= 9;

            String candidates = letters[digit];
            for (char c : candidates.toCharArray()) {
                dfs(combinations, combination + c, remain.substring(1));
            }
        }
    }
}
