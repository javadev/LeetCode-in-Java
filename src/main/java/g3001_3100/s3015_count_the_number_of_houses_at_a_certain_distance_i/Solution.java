package g3001_3100.s3015_count_the_number_of_houses_at_a_certain_distance_i;

// #Medium #Breadth_First_Search #Graph #Prefix_Sum
// #2024_02_28_Time_2_ms_(98.98%)_Space_44.1_MB_(90.10%)

public class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        int[] answer = new int[n];
        int distance = n - 1;
        int k = distance - 1;
        while (distance > 0) {
            answer[k] = (n - distance) * 2;
            distance--;
            k--;
        }
        if (x > y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        int skip = y - x;
        if (skip < 2) {
            return answer;
        }
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int oldDistance = j - i;
                int newDistance = Math.abs(x - i) + Math.abs(y - j) + 1;
                if (newDistance < oldDistance) {
                    answer[oldDistance - 1] -= 2;
                    answer[newDistance - 1] += 2;
                }
            }
        }
        return answer;
    }
}
