package g3401_3500.s3458_select_k_disjoint_special_substrings;

// #Medium #2025_02_16_Time_21_ms_(100.00%)_Space_45.30_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public boolean maxSubstringLength(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[][] freq = new int[2][26];
        for (int[] is : freq) {
            Arrays.fill(is, -1);
        }
        for (int i = 0; i < n; i++) {
            int x = arr[i] - 97;
            if (freq[0][x] == -1) {
                freq[0][x] = i;
            }
            freq[1][x] = i;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[0][i] == -1) {
                continue;
            }
            int max = freq[1][i];
            int min = freq[0][i];
            for (int j = freq[0][i]; j <= freq[1][i]; j++) {
                max = Math.max(max, freq[1][arr[j] - 'a']);
                min = Math.min(min, freq[0][arr[j] - 'a']);
            }
            freq[1][i] = max;
            freq[0][i] = min;
        }
        int[][] temp = new int[2][26];
        int x = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[0][i] != -1) {
                temp[0][x] = freq[0][i];
                temp[1][x] = freq[1][i];
                if (temp[1][x] == -1) {
                    temp[1][x] = temp[0][x];
                }
                x++;
            }
        }
        int[][] nums = new int[x][2];
        for (int i = 0; i < x; i++) {
            nums[i][0] = temp[0][i];
            nums[i][1] = temp[1][i];
        }
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        int[][] ans = new int[x][2];
        int y = 0;
        for (int i = 0; i < x; i++) {
            if (y == 0) {
                ans[y][0] = nums[i][0];
                ans[y][1] = nums[i][1];
                y++;
            } else {
                if (ans[y - 1][1] > nums[i][0]) {
                    if (ans[y - 1][1] < nums[i][1]) {
                        continue;
                    }
                    ans[y - 1][0] = nums[i][0];
                    ans[y - 1][1] = nums[i][1];
                } else {
                    ans[y][0] = nums[i][0];
                    ans[y][1] = nums[i][1];
                    y++;
                }
            }
        }
        if (y >= k) {
            if (y == 1 && k == 1) {
                return ans[0][0] != 0 || ans[0][1] != n - 1;
            }
            return true;
        }
        return false;
    }
}
