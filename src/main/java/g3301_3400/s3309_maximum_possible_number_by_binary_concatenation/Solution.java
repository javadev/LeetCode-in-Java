package g3301_3400.s3309_maximum_possible_number_by_binary_concatenation;

// #Medium #Array #Bit_Manipulation #Enumeration
// #2024_10_08_Time_3_ms_(97.01%)_Space_42.2_MB_(90.32%)

public class Solution {
    private String result = "0";

    public int maxGoodNumber(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        StringBuilder sb = new StringBuilder();
        solve(nums, visited, 0, sb);
        int score = 0;
        int val;
        for (char c : result.toCharArray()) {
            val = c - '0';
            score *= 2;
            score += val;
        }
        return score;
    }

    private void solve(int[] nums, boolean[] visited, int pos, StringBuilder sb) {
        if (pos == nums.length) {
            String val = sb.toString();
            if ((result.length() == val.length() && result.compareTo(val) < 0)
                    || val.length() > result.length()) {
                result = val;
            }
            return;
        }
        String cur;
        for (int i = 0; i < nums.length; ++i) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            cur = Integer.toBinaryString(nums[i]);
            sb.append(cur);
            solve(nums, visited, pos + 1, sb);
            sb.setLength(sb.length() - cur.length());
            visited[i] = false;
        }
    }
}
