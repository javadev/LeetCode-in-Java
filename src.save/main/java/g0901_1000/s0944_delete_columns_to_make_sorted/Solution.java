package g0901_1000.s0944_delete_columns_to_make_sorted;

// #Easy #Array #String #Acceptance_69.9% #2022_02_19_Time_11_ms_(59.39%)_Space_47.6_MB_(27.07%)

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
