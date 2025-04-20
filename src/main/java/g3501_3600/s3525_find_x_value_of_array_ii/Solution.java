package g3501_3600.s3525_find_x_value_of_array_ii;

// #Hard #2025_04_20_Time_7_ms_(100.00%)_Space_67.64_MB_(90.91%)

public class Solution {
    public int[] resultArray(int[] nums, int k, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            int index = q[0];
            int value = q[1];
            int start = q[2];
            int x = q[3];
            nums[index] = value;
            int count = 0;
            int currentProduct = 1;
            int lProcessed = 0;
            for (int j = start; j < nums.length; j++) {
                currentProduct = (currentProduct * (nums[j] % k)) % k;
                lProcessed++;
                if (currentProduct == x) {
                    count++;
                }
                if (currentProduct == 0) {
                    if (x == 0) {
                        int remaining = (nums.length - start) - lProcessed;
                        count += remaining;
                    }
                    break;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
