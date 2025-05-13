package g3501_3600.s3542_minimum_operations_to_convert_all_elements_to_zero;

// #Medium #Array #Hash_Table #Greedy #Stack #Monotonic_Stack
// #2025_05_13_Time_11_ms_(100.00%)_Space_60.16_MB_(91.63%)

public class Solution {
    public int minOperations(int[] nums) {
        int[] mq = new int[nums.length];
        int idx = 0;
        int res = 0;
        for (int num : nums) {
            if (num == 0) {
                res += idx;
                idx = 0;
            } else {
                while (idx > 0 && mq[idx - 1] >= num) {
                    if (mq[idx - 1] > num) {
                        res++;
                    }
                    idx--;
                }
                mq[idx++] = num;
            }
        }
        return res + idx;
    }
}
