package g1001_1100.s1015_smallest_integer_divisible_by_k;

// #Medium #Hash_Table #Math #2022_02_25_Time_2_ms_(90.67%)_Space_40.5_MB_(14.47%)

public class Solution {
    public int smallestRepunitDivByK(int k) {
        int n = 0;
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int i = 1;
        while (i <= k) {
            n = (n * 10 + 1) % k;
            if (n == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
