package g2701_2800.s2799_count_complete_subarrays_in_an_array;

// #Medium #Array #Hash_Table #Sliding_Window #2023_09_14_Time_3_ms_(99.82%)_Space_44_MB_(32.27%)

public class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int[] map = new int[2001];
        int last = 0;
        for (int i = 0; i < n; ++i) {
            map[nums[i]]++;
            if (map[nums[i]] == 1) {
                last = i;
            }
        }
        map = new int[2001];
        for (int i = 0; i <= last; ++i) {
            map[nums[i]]++;
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans += n - last;
            map[nums[i]]--;
            if (map[nums[i]] == 0) {
                int possLast = 0;
                for (int j = last + 1; j < n && map[nums[i]] == 0; ++j) {
                    map[nums[j]]++;
                    possLast = j;
                }
                if (map[nums[i]] > 0) {
                    last = possLast;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}
