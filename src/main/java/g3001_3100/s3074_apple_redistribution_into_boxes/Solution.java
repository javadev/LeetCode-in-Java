package g3001_3100.s3074_apple_redistribution_into_boxes;

// #Easy #Array #Sorting #Greedy #2024_04_15_Time_1_ms_(99.81%)_Space_41.9_MB_(89.46%)

public class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int[] count = new int[51];
        int appleSum = 0;
        for (int j : apple) {
            appleSum += j;
        }
        int req_capacity = 0;
        int max = 0;
        for (int j : capacity) {
            count[j]++;
            max = Math.max(max, j);
        }
        for (int i = max; i >= 0; i--) {
            if (count[i] >= 1) {
                while (count[i] != 0) {
                    appleSum -= i;
                    req_capacity++;
                    if (appleSum <= 0) {
                        return req_capacity;
                    }
                    count[i]--;
                }
            }
        }
        return req_capacity;
    }
}
