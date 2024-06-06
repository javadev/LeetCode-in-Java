package g3101_3200.s3168_minimum_number_of_chairs_in_a_waiting_room;

// #Easy #String #Simulation #2024_06_06_Time_1_ms_(100.00%)_Space_41.9_MB_(67.53%)

public class Solution {
    public int minimumChairs(String s) {
        int count = 0;
        int ans = Integer.MIN_VALUE;
        for (char ch : s.toCharArray()) {
            if (ch == 'E') {
                count++;
                ans = Math.max(ans, count);
            } else {
                count--;
            }
        }
        return ans;
    }
}
