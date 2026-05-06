package g3701_3800.s3779_minimum_number_of_operations_to_have_distinct_elements;

// #Medium #Array #Hash_Table #Senior #Biweekly_Contest_172
// #2026_05_06_Time_4_ms_(99.25%)_Space_132.03_MB_(83.46%)

public class Solution {
    public int minOperations(int[] nums) {
        boolean[] seen = new boolean[100001];
        int i = nums.length - 1;
        while (i >= 0) {
            if (seen[nums[i]]) {
                break;
            }
            seen[nums[i]] = true;
            i--;
        }
        return (i + 3) / 3;
    }
}
