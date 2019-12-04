package leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P20 {

    public boolean isValid(String s) {
        if (s == null) return false;
        if (s.trim().isEmpty()) return true;

        Map<Character, Character> pairs = new HashMap<>(3);
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');

        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (pairs.containsKey(c)) {
                parentheses.push(c);
            }
            else if (pairs.containsValue(c)) {
                if (parentheses.isEmpty()) return false;

                char lc = parentheses.pop();
                char rc = pairs.get(lc);
                if (rc != c) return false;
            }
            else {
                return false;
            }
        }

        return parentheses.isEmpty();
    }
}
