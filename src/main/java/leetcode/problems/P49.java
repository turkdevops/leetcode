package leetcode.problems;

import java.util.*;

public class P49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>(0);

        Map<String, List<String>> groupedAnagrams = new HashMap<>();

        for (String s : strs) {
            boolean exists = false;
            for (Map.Entry<String, List<String>> entry : groupedAnagrams.entrySet()) {
                if (isAnagram(s, entry.getKey())) {
                    entry.getValue().add(s);
                    exists = true;
                }
            }

            if (! exists) {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(s);
                groupedAnagrams.put(s, anagrams);
            }
        }

        return new ArrayList<>(groupedAnagrams.values());
    }

    private static boolean isAnagram(String a, String b) {
        if (a == null || b == null) throw new IllegalArgumentException("null value has no anagram");
        if (a.length() != b.length()) return false;

        int length = a.length();

        Map<Character, Integer> charCounts = new HashMap<>(length);
        for (int i = 0; i < length; ++i) {
            char c = a.charAt(i);
            charCounts.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        for (int i = 0; i < length; ++i) {
            char c = b.charAt(i);
            charCounts.compute(c, (k, v) -> {
                if (v == null) return -1;
                else if (v == 1) return null;
                else return v - 1;
            });
        }

        return charCounts.isEmpty();
    }
}
