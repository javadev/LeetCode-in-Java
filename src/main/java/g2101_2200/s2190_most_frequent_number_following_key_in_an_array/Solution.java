package g2101_2200.s2190_most_frequent_number_following_key_in_an_array;

// #Easy #Array #Hash_Table #Counting #2022_06_07_Time_1_ms_(100.00%)_Space_42.3_MB_(90.80%)

public class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] store = new int[1001];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                store[nums[i + 1]]++;
            }
        }
        int res = 0;
        int count = store[0];
        for (int i = 1; i < 1001; i++) {
            if (count < store[i]) {
                count = store[i];
                res = i;
            }
        }
        return res;
    }
}
