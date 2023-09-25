package g1401_1500.s1442_count_triplets_that_can_form_two_arrays_of_equal_xor;

// #Medium #Array #Hash_Table #Math #Bit_Manipulation #Prefix_Sum
// #2022_03_28_Time_2_ms_(79.80%)_Space_41_MB_(76.26%)

public class Solution {
    public int countTriplets(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int xor = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                xor ^= arr[k];
                if (xor == 0) {
                    count += k - i;
                }
            }
        }
        return count;
    }
}
