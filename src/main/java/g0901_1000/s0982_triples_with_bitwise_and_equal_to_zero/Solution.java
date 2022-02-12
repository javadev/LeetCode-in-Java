package g0901_1000.s0982_triples_with_bitwise_and_equal_to_zero;

// #Hard #Array #Hash_Table #Bit_Manipulation

public class Solution {
    public int countTriplets(int[] nums) {
        int[] arr = new int[1 << 17];
        for (int num : nums) {
            int mask = 0;
            for (int i = 0; i < 16; i++) {
                if ((num & (1 << i)) == 0) {
                    mask |= (1 << i);
                }
            }
            int s = mask;
            while (s > 0) {
                arr[s]++;
                s = (s - 1) & mask;
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int val = nums[i] & nums[j];
                if (val == 0) {
                    count += nums.length;
                } else {
                    int mask = 0;
                    for (int k = 0; k < 16; k++) {
                        if ((val & (1 << k)) > 0) {
                            mask |= (1 << k);
                        }
                    }
                    count += arr[mask];
                }
            }
        }
        return count;
    }
}
