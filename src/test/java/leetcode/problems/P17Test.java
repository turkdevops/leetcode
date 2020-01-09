package leetcode.problems;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

public class P17Test {

    @Test
    public void letterCombinations() {
        test("23");
        test("93");
        test("39");
    }

    private void test(String digits) {
        List<String> rv = new P17().letterCombinations(digits);
        System.out.println(rv);
    }
}