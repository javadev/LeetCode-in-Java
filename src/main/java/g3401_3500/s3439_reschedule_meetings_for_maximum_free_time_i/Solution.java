package g3401_3500.s3439_reschedule_meetings_for_maximum_free_time_i;

// #Medium #Array #Greedy #Sliding_Window #2025_02_04_Time_2_(83.15%)_Space_63.84_(13.98%)

public class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int[] gap = new int[startTime.length + 1];
        gap[0] = startTime[0];
        for (int i = 1; i < startTime.length; ++i) {
            gap[i] = startTime[i] - endTime[i - 1];
        }
        gap[startTime.length] = eventTime - endTime[endTime.length - 1];
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < gap.length; ++i) {
            sum += gap[i] - ((i >= k + 1) ? gap[i - (k + 1)] : 0);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
