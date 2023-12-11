package g0901_1000.s0944_delete_columns_to_make_sorted;

// #Easy #Array #String #2022_12_26_Time_9_ms_(87.09%)_Space_42.8_MB_(73.30%)

public class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
