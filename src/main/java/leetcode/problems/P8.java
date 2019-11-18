package leetcode.problems;

public class P8 {

    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;

        int length = str.length();

        int i = 0;
        while (i < length) {
            if (str.charAt(i) == ' ') {
                i++;
            }
            else {
                break;
            }
        }

        if (i == length) return 0;

        boolean signed = str.charAt(i) == '+' || str.charAt(i) == '-';
        boolean isPositive = !signed || str.charAt(i) == '+';
        i += signed ? 1 : 0;

        int rv = 0;
        while (i < length) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int v = c - '0';
                if (isPositive && (rv > Integer.MAX_VALUE / 10 || (rv == Integer.MAX_VALUE / 10 && v > Integer.MAX_VALUE % 10))) {
                    return Integer.MAX_VALUE;
                }
                else if (!isPositive && (-1 * rv < Integer.MIN_VALUE / 10 || (-1 * rv == Integer.MIN_VALUE / 10 && -1 * v < Integer.MIN_VALUE % 10))) {
                    return Integer.MIN_VALUE;
                }
                else {
                    rv = rv * 10 + v;
                }
            }
            else {
                break;
            }
            i++;
        }

        return isPositive ? rv : -1 * rv;
    }
}
