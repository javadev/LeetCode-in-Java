package g2601_2700.s2672_number_of_adjacent_elements_with_the_same_color;

// #Medium #Array #2023_09_10_Time_4_ms_(100.00%)_Space_96_MB_(23.28%)

public class Solution {
    public int[] colorTheArray(int n, int[][] q) {
        if (n == 1) {
            return new int[q.length];
        }
        int[] ans = new int[q.length];
        int[] color = new int[n];
        int cnt = 0;
        for (int i = 0; i < q.length; i++) {
            int ind = q[i][0];
            int assColor = q[i][1];
            int leftColor = 0;
            int rytColor = 0;
            if (ind - 1 >= 0) {
                leftColor = color[ind - 1];
            }
            if (ind + 1 < n) {
                rytColor = color[ind + 1];
            }
            if (color[ind] != 0 && leftColor == color[ind]) {
                cnt--;
            }
            if (color[ind] != 0 && rytColor == color[ind]) {
                cnt--;
            }
            color[ind] = assColor;
            if (color[ind] != 0 && leftColor == color[ind]) {
                cnt++;
            }
            if (color[ind] != 0 && rytColor == color[ind]) {
                cnt++;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}
