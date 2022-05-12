package g1901_2000.s1904_the_number_of_full_rounds_you_have_played;

// #Medium #String #Math #2022_05_11_Time_2_ms_(37.11%)_Space_42.1_MB_(40.55%)

public class Solution {
    public int numberOfRounds(String startTime, String finishTime) {
        int rounds = 0;
        int startHour = Integer.parseInt(startTime.split(":")[0]);
        int endHour = Integer.parseInt(finishTime.split(":")[0]);
        int startMin = Integer.parseInt(startTime.split(":")[1]);
        int endMin = Integer.parseInt(finishTime.split(":")[1]);
        if (endHour < startHour || endHour == startHour && endMin < startMin) {
            endHour += 24;
        }
        if (startHour == endHour) {
            if (startMin == 0 && endMin >= 15) {
                rounds++;
            }
            if (startMin <= 15 && endMin >= 30) {
                rounds++;
            }
            if (startMin <= 30 && endMin >= 45) {
                rounds++;
            }
        } else {
            // compute all full rounds in the start hour
            if (startMin == 0) {
                rounds += 4;
            } else if (startMin <= 15) {
                rounds += 3;
            } else if (startMin <= 30) {
                rounds += 2;
            } else if (startMin <= 45) {
                rounds++;
            }
            // compute all full rounds in the finish hour
            if (endMin >= 45) {
                rounds += 3;
            } else if (endMin >= 30) {
                rounds += 2;
            } else if (endMin >= 15) {
                rounds++;
            }
            // compute all full rounds in the all full hours between finishHour and startHour
            rounds += (endHour - startHour - 1) * 4;
        }
        return rounds;
    }
}
