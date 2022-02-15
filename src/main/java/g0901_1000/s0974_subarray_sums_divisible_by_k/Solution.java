package g0901_1000.s0974_subarray_sums_divisible_by_k;

// #Medium #Array #Hash_Table #Prefix_Sum

public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] map = new int[k];
        int ans = 0;
        int sum = 0;
        map[0] = 1;
        for (int num : nums) {
            sum += num;
            int temp = sum % k;
            if (temp < 0) {
                temp += k;
            }
            ans += map[temp]++;
        }
        return ans;
    }
}
