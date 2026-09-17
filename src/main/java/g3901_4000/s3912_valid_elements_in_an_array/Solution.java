package g3901_4000.s3912_valid_elements_in_an_array;

// #Easy #Array #Mid_Level #Weekly_Contest_499
// #2026_09_17_Time_1_ms_(100.00%)_Space_46.47_MB_(82.58%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer>ans = new ArrayList<>();
        int n = nums.length;
        ans.add(nums[0]);
        for (int i=1; i<n-1; i++) {
            boolean left = true;
            boolean right = true;
            for (int j=0; j < i; j++) {
                if (nums[i] <= nums[j]) {
                    left = false;
                    break;
                }
            }
            for(int j = i + 1; j<n; j++) {
                if(nums[i] <= nums[j]) {
                    right = false;
                    break;
                }
            }
            if(left || right){
                ans.add(nums[i]);
            }
        }
        if(n > 1){
            ans.add(nums[n-1]);
        }
        return ans;
    }
}

