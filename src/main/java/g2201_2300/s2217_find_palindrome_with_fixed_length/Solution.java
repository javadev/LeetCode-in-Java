package g2201_2300.s2217_find_palindrome_with_fixed_length;

// #Medium #Array #Math #2022_06_12_Time_37_ms_(88.60%)_Space_53.7_MB_(77.19%)

@SuppressWarnings("java:S2184")
public class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        long minHalf = (long) Math.pow(10, (intLength - 1) / 2);
        long maxIndex = (long) Math.pow(10, (intLength + 1) / 2) - minHalf;
        boolean isOdd = intLength % 2 == 1;
        long[] res = new long[queries.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = queries[i] > maxIndex ? -1 : helper(queries[i], minHalf, isOdd);
        }
        return res;
    }

    private long helper(long index, long minHalf, boolean isOdd) {
        long half = minHalf + index - 1;
        long res = half;
        if (isOdd) {
            res /= 10;
        }
        while (half != 0) {
            res = res * 10 + half % 10;
            half /= 10;
        }
        return res;
    }
}
