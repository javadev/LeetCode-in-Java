package g2401_2500.s2475_number_of_unequal_triplets_in_array;

// #Easy #Array #Hash_Table #2023_01_24_Time_1_ms_(97.49%)_Space_40.3_MB_(57.72%)

public class Solution {
    public int unequalTriplets(int[] nums) {
        int trips = 0;
        int pairs = 0;
        int[] count = new int[1001];
        for (int i = 0; i < nums.length; ++i) {
            trips += pairs - count[nums[i]] * (i - count[nums[i]]);
            pairs += i - count[nums[i]];
            count[nums[i]] += 1;
        }
        return trips;
    }
}
