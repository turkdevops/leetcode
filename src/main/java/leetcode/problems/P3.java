package leetcode.problems;

public class P3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        int longest = 1;

        int length = s.length();
        for (int i = 0; i < length - 1; ++i) {
            for (int j = i + 1; j < length; ++j) {
                if (!isUnique(s, i, j, s.charAt(j))) {
                    longest = Math.max(longest, j - i);
                    break;
                }
                else if (j == length - 1) {
                    longest = Math.max(longest, j - i + 1);
                }
            }
        }

        return longest;
    }

    private static boolean isUnique(String s, int from, int to, char c) {
        for (int i = from; i < to; ++i) {
            if (c == s.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
