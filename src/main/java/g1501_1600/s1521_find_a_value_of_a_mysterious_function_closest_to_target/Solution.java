package g1501_1600.s1521_find_a_value_of_a_mysterious_function_closest_to_target;

// #Hard #Array #Binary_Search #Bit_Manipulation #Segment_Tree
// #2022_04_09_Time_9_ms_(100.00%)_Space_58.4_MB_(94.74%)

public class Solution {
    public int closestToTarget(int[] arr, int target) {
        int[] prefix = new int[22];
        prefix[0] = -1;
        int res = Integer.MAX_VALUE;
        int size = 1;
        for (int a : arr) {
            int ns = 1;
            for (int i = 1; i < size; i++) {
                if (prefix[ns - 1] != (prefix[i] & a)) {
                    prefix[ns++] = prefix[i] & a;
                    res = Math.min(res, Math.abs((prefix[i] & a) - target));
                }
            }
            if (prefix[ns - 1] != a) {
                prefix[ns++] = a;
                res = Math.min(res, Math.abs(a - target));
            }
            size = ns;
        }
        return res;
    }
}
