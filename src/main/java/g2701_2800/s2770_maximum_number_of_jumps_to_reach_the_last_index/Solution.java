package g2701_2800.s2770_maximum_number_of_jumps_to_reach_the_last_index;

// #Medium #Array #Dynamic_Programming #2023_09_21_Time_17_ms_(60.93%)_Space_44_MB_(28.52%)

public class Solution {
    private static class Pair {
        int prev;
        int len;

        Pair(int prev, int len) {
            this.prev = prev;
            this.len = len;
        }
    }

    public int maximumJumps(int[] nums, int target) {
        Pair[] arr = new Pair[nums.length];
        arr[0] = new Pair(0, 0);
        for (int i = 1; i < nums.length; i++) {
            arr[i] = new Pair(-1, 0);
            for (int j = i - 1; j >= 0; j--) {
                if (Math.abs(nums[i] - nums[j]) <= target
                        && arr[j].prev != -1
                        && arr[j].len + 1 > arr[i].len) {
                    arr[i].prev = j;
                    arr[i].len = arr[j].len + 1;
                }
            }
        }
        return arr[nums.length - 1].len > 0 ? arr[nums.length - 1].len : -1;
    }
}
