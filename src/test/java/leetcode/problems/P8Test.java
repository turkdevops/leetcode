package leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P8Test {

    @Test
    public void myAtoi() {
        test("0", 0);
        test("+0", 0);
        test("-0", 0);

        test("42", 42);
        test("-42", -42);
        test("    42xxx", 42);

        test("91283472332", 2147483647);
        test("-91283472332", -2147483648);

        test("-2147483649", -2147483648);
    }

    private void test(String str, int expected) {
        int v = new P8().myAtoi(str);
        Assert.assertEquals(expected, v);
    }
}