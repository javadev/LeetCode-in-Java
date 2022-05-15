package g0001_0100.s0080_remove_duplicates_from_sorted_array_ii;

// #Medium #Array #Two_Pointers #Acceptance_50.6%
// #2022_02_19_Time_1_ms_(77.11%)_Space_43.9_MB_(63.26%)

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        int count = 0;
        while (i < nums.length - 1) {
            ++count;
            if (count <= 2) {
                nums[k++] = nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                count = 0;
                i++;
                continue;
            }
            i++;
        }

        ++count;
        if (count <= 2) {
            nums[k++] = nums[i];
        }
        return k;
    }
}
