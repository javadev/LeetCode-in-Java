package g3501_3600.s3576_transform_array_to_all_equal_elements;

// #Medium #2025_06_08_Time_7_ms_(99.86%)_Space_62.66_MB_(5.31%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) {
            return true;
        }
        int prod = 1;
        for (int x : nums) {
            prod *= x;
        }
        List<Integer> targets = new ArrayList<>();
        for (int target : new int[] {1, -1}) {
            int tPowN = (n % 2 == 0 ? 1 : target);
            if (tPowN == prod) {
                targets.add(target);
            }
        }
        if (targets.isEmpty()) {
            return false;
        }
        for (int target : targets) {
            int ops = 0;
            int[] a = nums.clone();
            for (int i = 0; i < n - 1 && ops <= k; i++) {
                if (a[i] != target) {
                    a[i] = -a[i];
                    a[i + 1] = -a[i + 1];
                    ops++;
                }
            }
            if (ops <= k && a[n - 1] == target) {
                return true;
            }
        }
        return false;
    }
}
