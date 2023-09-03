package g1201_1300.s1224_maximum_equal_frequency;

// #Hard #Array #Hash_Table #2022_03_12_Time_17_ms_(93.59%)_Space_76.9_MB_(39.74%)

public class Solution {
    public int maxEqualFreq(int[] nums) {
        int[] count = new int[100001];
        int[] freq = new int[100001];
        int n = nums.length;
        for (int num : nums) {
            count[num]++;
            freq[count[num]]++;
        }
        for (int i = n - 1; i > 0; i--) {
            if (freq[count[nums[i]]] * count[nums[i]] == i) {
                return i + 1;
            }
            freq[count[nums[i]]]--;
            count[nums[i]]--;
            if (freq[count[nums[i - 1]]] * count[nums[i - 1]] == i) {
                return i + 1;
            }
        }
        return 1;
    }
}
