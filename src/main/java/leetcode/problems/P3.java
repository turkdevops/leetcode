package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        int length = s.length();
        Map<Character, Integer> dropCounts = new HashMap<>(length);

        int longest = 0;
        for (int dropCount = 0, i = 0; i < length; ++i) {
            Integer oldDropCount = dropCounts.put(s.charAt(i), i + 1);
            if (oldDropCount != null) {
                dropCount = Math.max(dropCount, oldDropCount);
            }

            longest = Math.max(longest, i + 1 - dropCount);
        }

        return longest;
    }
}
