package g2401_2500.s2409_count_days_spent_together;

// #Easy #String #Math #2022_10_24_Time_0_ms_(100.00%)_Space_40.3_MB_(91.71%)

public class Solution {
    private int[] dates = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(
            String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        if (leaveAlice.compareTo(arriveBob) < 0 || leaveBob.compareTo(arriveAlice) < 0) {
            return 0;
        }
        String end = leaveAlice.compareTo(leaveBob) <= 0 ? leaveAlice : leaveBob;
        String start = arriveAlice.compareTo(arriveBob) <= 0 ? arriveBob : arriveAlice;
        String[] starts = start.split("-");
        String[] ends = end.split("-");
        Integer startMonth = Integer.valueOf(starts[0]);
        Integer endMonth = Integer.valueOf(ends[0]);
        int res = 0;
        if (startMonth.equals(endMonth)) {
            res += (Integer.valueOf(ends[1]) - Integer.valueOf(starts[1]) + 1);
            return res;
        }
        for (int i = startMonth; i <= endMonth; i++) {
            if (i == endMonth) {
                res += Integer.valueOf(ends[1]);
            } else if (i == startMonth) {
                res += dates[i] - Integer.valueOf(starts[1]) + 1;
            } else {
                res += dates[i];
            }
        }
        return res;
    }
}
