package g1901_2000.s1979_find_greatest_common_divisor_of_array;

// #Easy #Array #Math #Number_Theory #2022_06_20_Time_1_ms_(87.75%)_Space_43.7_MB_(53.31%)

public class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        return findGCD(max, min);
    }

    private int findGCD(int x, int y) {
        int r;
        int a;
        int b;
        a = (x > y) ? x : y;
        b = (x < y) ? x : y;
        r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}
