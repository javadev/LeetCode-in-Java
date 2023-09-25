package g2201_2300.s2206_divide_array_into_equal_pairs;

// #Easy #Array #Hash_Table #Bit_Manipulation #Counting
// #2022_06_11_Time_1_ms_(100.00%)_Space_42.2_MB_(94.00%)

public class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];
        for (int num : nums) {
            ++freq[num];
        }
        for (int f : freq) {
            if (f % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
