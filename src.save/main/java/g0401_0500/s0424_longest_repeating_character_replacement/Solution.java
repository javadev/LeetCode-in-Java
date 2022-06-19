package g0401_0500.s0424_longest_repeating_character_replacement;

// #Medium #String #Hash_Table #Sliding_Window #Level_1_Day_12_Sliding_Window/Two_Pointer
// #2022_03_18_Time_5_ms_(92.61%)_Space_43.2_MB_(49.35%)

public class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int len = s.length();
        int[] count = new int[256];
        char[] sArr = s.toCharArray();
        int currMax = 0;
        int maxLen = 0;
        char curr;
        while (right < len) {
            curr = sArr[right];
            count[curr]++;
            currMax = Math.max(currMax, count[curr]);
            if (right - left + 1 <= currMax + k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            while (right - left + 1 > currMax + k) {
                curr = sArr[left];
                count[curr]--;
                left++;
            }
            right++;
        }
        return maxLen;
    }
}
