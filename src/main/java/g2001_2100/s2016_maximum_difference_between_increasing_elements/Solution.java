package g2001_2100.s2016_maximum_difference_between_increasing_elements;

// #Array
// #2022_05_23_Time_0ms_(100%)_Space_42.9_MB_(20.20%)

<<<<<<< HEAD
import java.util.*;

public class Solution {
    public int maximumDifference(int[] nums) {
        int mini = nums[0]; // we keep the track of minimum element while traversing to maximise
        // nums[j] - nums[i]
        // if arr[i] is minimum arr[j] - arr[i] will be maximum
        int ans = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < mini) mini = nums[i];
            if (nums[i + 1] - mini > ans) ans = nums[i + 1] - mini;
        }
        if (ans <= 0) return -1; // if ans is not increased we simply return -1
=======
public class Solution {
    public int maximumDifference(int[] nums) {
        int mini = nums[0];
        int ans = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < mini) {
                mini = nums[i];
            }
            if (nums[i + 1] - mini > ans) {
                ans = nums[i + 1] - mini;
            }
        }
        if (ans <= 0) {
            return -1;
        }
>>>>>>> f9fa3338840c8d2b3211936da3db24212b7cddec
        return ans;
    }
}
