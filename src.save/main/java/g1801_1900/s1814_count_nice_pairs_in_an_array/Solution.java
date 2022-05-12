package g1801_1900.s1814_count_nice_pairs_in_an_array;

// #Medium #Array #Hash_Table #Math #Counting #2022_05_03_Time_47_ms_(83.12%)_Space_77.6_MB_(28.57%)

import java.util.HashMap;

public class Solution {
    private int rev(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        return r;
    }

    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> revMap = new HashMap<>();
        int cnt = 0;
        for (int num : nums) {
            int lhs = num - rev(num);
            int prevCnt = revMap.getOrDefault(lhs, 0);
            cnt += prevCnt;
            int mod = 1000000007;
            cnt = cnt % mod;
            revMap.put(lhs, prevCnt + 1);
        }
        return cnt;
    }
}
