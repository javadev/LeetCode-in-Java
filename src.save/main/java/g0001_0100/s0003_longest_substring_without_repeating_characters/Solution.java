package g0001_0100.s0003_longest_substring_without_repeating_characters;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Sliding_Window
// #Algorithm_I_Day_6_Sliding_Window #2022_02_17_Time_3_ms_(95.99%)_Space_44.1_MB_(33.09%)

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndices = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndices[i] = -1;
        }

        int maxLen = 0;
        int curLen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (lastIndices[cur] < start) {
                lastIndices[cur] = i;
                curLen++;
            } else {
                int lastIndex = lastIndices[cur];
                start = lastIndex + 1;
                curLen = i - start + 1;
                lastIndices[cur] = i;
            }

            if (curLen > maxLen) {
                maxLen = curLen;
            }
        }

        return maxLen;
    }
}
