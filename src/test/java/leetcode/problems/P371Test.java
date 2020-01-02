package leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P371Test {

    @Test
    public void getSum() {
        test(0, 1);
        test(1, 2);
        test(159, 202);
        test(-1, 1);
        test(0, 0);
        test(-2, -10);
    }

    private void test(int a, int b) {
        int sum = new P371().getSum(a, b);
        Assert.assertEquals(a + b, sum);
    }
}