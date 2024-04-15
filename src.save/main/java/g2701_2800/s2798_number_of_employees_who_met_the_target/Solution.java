package g2701_2800.s2798_number_of_employees_who_met_the_target;

// #Easy #Array #Enumeration #2023_09_14_Time_0_ms_(100.00%)_Space_40.6_MB_(98.10%)

public class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i : hours) {
            if (i >= target) {
                count++;
            }
        }
        return count;
    }
}
