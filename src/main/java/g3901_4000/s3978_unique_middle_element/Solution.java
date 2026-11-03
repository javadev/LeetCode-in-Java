package g3901_4000.s3978_unique_middle_element;

// #Easy #Array #Counting #Mid_Level #Biweekly_Contest_186
// #2026_11_03_Time_1_ms_(94.19%)_Space_45.62_MB_(97.22%)

public class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length / 2;
        int key = nums[mid];
        int freq = 0;
        for (int ele : nums) {
            if (ele == key) {
                freq++;
            }
        }
        return (freq == 1);
    }
}
