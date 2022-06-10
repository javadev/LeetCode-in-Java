package g2001_2100.s2037_minimum_number_of_moves_to_seat_everyone;

// #Easy #Array #Sorting #2022_05_25_Time_5_ms_(22.01%)_Space_43.7_MB_(67.19%)

import java.util.Arrays;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            ans += Math.abs(seats[i] - students[i]);
        }
        return ans;
    }
}
