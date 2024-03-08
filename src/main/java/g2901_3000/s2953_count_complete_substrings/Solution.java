package g2901_3000.s2953_count_complete_substrings;

// #Hard #String #Hash_Table #Sliding_Window #2024_01_15_Time_107_ms_(89.47%)_Space_47_MB_(42.61%)

public class Solution {
    public int countCompleteSubstrings(String word, int k) {
        char[] arr = word.toCharArray();
        int n = arr.length;
        int result = 0;
        int last = 0;
        for (int i = 1; i <= n; i++) {
            if (i == n || Math.abs(arr[i] - arr[i - 1]) > 2) {
                result += getCount(arr, k, last, i - 1);
                last = i;
            }
        }
        return result;
    }

    private int getCount(char[] arr, int k, int start, int end) {
        int result = 0;
        for (int i = 1; i <= 26 && i * k <= end - start + 1; i++) {
            int[] cnt = new int[26];
            int good = 0;
            for (int j = start; j <= end; j++) {
                char cR = arr[j];
                cnt[cR - 'a']++;
                if (cnt[cR - 'a'] == k) {
                    good++;
                }
                if (cnt[cR - 'a'] == k + 1) {
                    good--;
                }
                if (j >= start + i * k) {
                    char cL = arr[j - i * k];
                    if (cnt[cL - 'a'] == k) {
                        good--;
                    }
                    if (cnt[cL - 'a'] == k + 1) {
                        good++;
                    }
                    cnt[cL - 'a']--;
                }
                if (good == i) {
                    result++;
                }
            }
        }
        return result;
    }
}
