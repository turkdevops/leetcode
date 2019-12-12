package leetcode.problems;

public class P5 {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        int length = s.length();

        int begin = 0;
        int longest = 0;

        for (int si = 0; si < length; ++si) {
            for (int ei = si; ei < length; ++ei) {
                if (isPalindrome(s, si, ei)) {
                    int len = ei - si + 1;
                    if (len > longest) {
                        longest = len;
                        begin = si;
                    }
                }
            }
        }

        return s.substring(begin, begin + longest);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }

        return true;
    }
}
