package g1401_1500.s1450_number_of_students_doing_homework_at_a_given_time;

// #Easy #Array #2022_03_28_Time_0_ms_(100.00%)_Space_40.3_MB_(86.45%)

public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }
        return count;
    }
}
