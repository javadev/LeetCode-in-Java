package g1501_1600.s1524_number_of_sub_arrays_with_odd_sum;

// #Medium #Array #Dynamic_Programming #Math #Prefix_Sum
// #2022_04_09_Time_9_ms_(90.24%)_Space_97_MB_(68.09%)

public class Solution {
    public int numOfSubarrays(int[] arr) {
        int number = arr[0] % 2 == 0 ? 0 : 1;
        long res = number;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                number = i - number + 1;
            }
            res += number;
        }
        long mod = 1_000_000_007;
        return (int) (res % mod);
    }
}
