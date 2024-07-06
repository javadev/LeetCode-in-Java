package g3201_3300.s3201_find_the_maximum_length_of_valid_subsequence_i;

// #Medium #Array #Dynamic_Programming #2024_07_04_Time_5_ms_(82.23%)_Space_61.7_MB_(91.46%)

public class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int alter = 1;
        int odd = 0;
        int even = 0;
        if (nums[0] % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        boolean lastodd = nums[0] % 2 != 0;
        for (int i = 1; i < n; i++) {
            boolean flag = nums[i] % 2 == 0;
            if (flag) {
                if (lastodd) {
                    alter++;
                    lastodd = false;
                }
                even++;
            } else {
                if (!lastodd) {
                    alter++;
                    lastodd = true;
                }
                odd++;
            }
        }
        return Math.max(alter, Math.max(odd, even));
    }
}
