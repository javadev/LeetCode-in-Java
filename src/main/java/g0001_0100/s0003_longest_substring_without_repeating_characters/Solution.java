package g0001_0100.s0003_longest_substring_without_repeating_characters;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Sliding_Window
// #Algorithm_I_Day_6_Sliding_Window #Level_2_Day_14_Sliding_Window/Two_Pointer #Udemy_Strings
// #Top_Interview_150_Sliding_Window #Big_O_Time_O(n)_Space_O(1) #AI_can_be_used_to_solve_the_task
// #2024_11_09_Time_2_ms_(98.59%)_Space_43.4_MB_(90.39%)

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
