package leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P5Test {

    @Test
    public void longestPalindrome() {
        test("", "");
        test("a", "a");
        test("dabad", "dabad");
        test("dabac", "aba");
    }

    private void test(String s, String palindrome) {
        String rv = new P5().longestPalindrome(s);
        Assert.assertEquals(palindrome, rv);
    }
}