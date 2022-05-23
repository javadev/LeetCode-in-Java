package g2001_2100.s2094_finding_3_digit_even_numbers;

// #Easy #Array #Hash_Table #Sorting #Enumeration
// #2022_05_23_Time_2_ms_(99.62%)_Space_44.9_MB_(69.58%)

import java.util.Arrays;

public class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] idx = new int[1];
        int[] result = new int[9 * 10 * 5];
        int[] digitMap = new int[10];
        for (int digit : digits) {
            digitMap[digit]++;
        }
        dfs(result, digitMap, idx, 0);
        return Arrays.copyOfRange(result, 0, idx[0]);
    }

    private void dfs(int[] result, int[] digitMap, int[] idx, int val) {
        if (val > 99) {
            result[idx[0]++] = val;
            return;
        }
        val *= 10;
        for (int i = 0; i < 10; i++) {
            if (digitMap[i] == 0 || (val == 0 && i == 0) || (val > 99 && (i & 1) == 1)) {
                continue;
            }
            digitMap[i]--;
            val += i;
            dfs(result, digitMap, idx, val);
            val -= i;
            digitMap[i]++;
        }
    }
}
