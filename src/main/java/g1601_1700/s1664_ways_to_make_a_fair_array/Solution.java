package g1601_1700.s1664_ways_to_make_a_fair_array;

// #Medium #Array #Dynamic_Programming #2022_04_23_Time_11_ms_(71.76%)_Space_91.8_MB_(44.21%)

public class Solution {
    public int waysToMakeFair(int[] nums) {
        int res = 0;
        int[] even = new int[nums.length];
        int[] odd = new int[nums.length];
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
            even[i] = evenSum;
            odd[i] = oddSum;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                evenSum = odd[nums.length - 1] - odd[0];
                oddSum = even[nums.length - 1] - even[0];
            } else {
                oddSum = odd[i - 1] + even[nums.length - 1] - even[i];
                evenSum = even[i - 1] + odd[nums.length - 1] - odd[i];
            }
            if (evenSum == oddSum) {
                res++;
            }
        }
        return res;
    }
}
