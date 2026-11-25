package g4001_4100.s4038_count_integers_appearing_in_a_single_block;

// #Easy #Array #Hash_Table #Counting #Mid_Level #Weekly_Contest_517
// #2026_11_25_Time_1_ms_(99.14%)_Space_43.37_MB_(73.66%)

public class Solution {
    public int countSpecialIntegers(int[] nums) {
        boolean[] seen = new boolean[101];
        boolean[] special = new boolean[101];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                if (seen[nums[i]]) {
                    special[nums[i]] = false;
                } else {
                    seen[nums[i]] = true;
                    special[nums[i]] = true;
                }
            }
        }
        for (int x = 1; x <= 100; x++) {
            if (special[x]) {
                count++;
            }
        }
        return count;
    }
}
