package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        int length = s.length();
        Map<Character, Integer> indexes = new HashMap<>(length);

        int longest = 0;
        int beginIndex = 0;

        for (int i = 0; i < length; ++i) {
            Integer oldIndex = indexes.put(s.charAt(i), i);
            if (oldIndex != null) {
                longest = Math.max(longest, i - beginIndex);

                // remove from [beginIndex, oldIndex)
                // do not need to remove oldIndex since it is replaced with i
                for (int bi = beginIndex; bi < oldIndex; ++bi) {
                    indexes.remove(s.charAt(bi));
                }

                beginIndex = oldIndex + 1;
            }
            else if (i == length - 1) {
                longest = Math.max(longest, i - beginIndex + 1);
            }
        }

        return longest;
    }
}
