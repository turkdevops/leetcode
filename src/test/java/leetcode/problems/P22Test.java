package leetcode.problems;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class P22Test {

    @Test
    public void generateParenthesis() {
        test(1);
        test(2);
        test(3);
    }

    private void test(int count) {
        List<String> rv = new P22().generateParenthesis(count);
        System.out.println(rv);
    }
}