package g1301_1400.s1306_jump_game_iii;

// #Medium #Array #Depth_First_Search #Breadth_First_Search
// #Graph_Theory_I_Day_11_Breadth_First_Search #Udemy_Arrays
// #2022_03_14_Time_2_ms_(96.23%)_Space_53.6_MB_(80.90%)

public class Solution {
    private boolean[] dp;
    private boolean found = false;

    public boolean canReach(int[] arr, int start) {
        if (arr[start] == 0) {
            return true;
        }
        dp = new boolean[arr.length];
        dp[start] = true;
        recurse(arr, start);
        return found;
    }

    private void recurse(int[] arr, int index) {
        if (found) {
            return;
        }
        if (index - arr[index] >= 0 && !dp[index - arr[index]]) {
            if (arr[index - arr[index]] == 0) {
                found = true;
                return;
            }
            dp[index - arr[index]] = true;
            recurse(arr, index - arr[index]);
        }
        if (index + arr[index] < arr.length && !dp[index + arr[index]]) {
            if (arr[index + arr[index]] == 0) {
                found = true;
                return;
            }
            dp[index + arr[index]] = true;
            recurse(arr, index + arr[index]);
        }
    }
}
