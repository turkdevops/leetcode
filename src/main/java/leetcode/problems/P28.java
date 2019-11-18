package leetcode.problems;

public class P28 {

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            throw new IllegalArgumentException("haystack or needle is nul");
        }

        if (needle.isEmpty()) return 0;

        return haystack.indexOf(needle);
    }
}
