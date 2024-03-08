package g1301_1400.s1343_number_of_sub_arrays_of_size_k_and_average_greater_than_or_equal_to_threshold;

// #Medium #Array #Sliding_Window #2022_03_19_Time_5_ms_(46.57%)_Space_70.2_MB_(39.71%)

public class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for (int i = 0; i < k - 1; i++) {
            sum += arr[i];
        }
        int count = 0;
        for (int i = k - 1; i < arr.length; i++) {
            sum += arr[i];
            if (i - k >= 0) {
                sum -= arr[i - k];
            }
            if (sum / k >= threshold) {
                count++;
            }
        }
        return count;
    }
}
