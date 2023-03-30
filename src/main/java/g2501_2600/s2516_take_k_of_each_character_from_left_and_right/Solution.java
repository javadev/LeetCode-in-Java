package g2501_2600.s2516_take_k_of_each_character_from_left_and_right;

// #Medium #String #Hash_Table #Sliding_Window #2023_03_30_Time_6_ms_(94.24%)_Space_43.5_MB_(46.60%)

public class Solution {
    public int takeCharacters(String s, int k) {
        if (s.length() < 3 * k) {
            return -1;
        }
        int[] cnt = new int[3];
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            cnt[ch - 'a']++;
        }
        if (cnt[0] < k || cnt[1] < k || cnt[2] < k) {
            return -1;
        }
        int ans = arr.length;
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            cnt[arr[j] - 'a']--;
            if (cnt[0] >= k && cnt[1] >= k && cnt[2] >= k) {
                ans = Math.min(ans, arr.length - (j - i + 1));
                j++;
            } else {
                cnt[arr[i] - 'a']++;
                i++;
                j++;
            }
        }
        return ans;
    }
}
