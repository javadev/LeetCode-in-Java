package g2201_2300.s2224_minimum_number_of_operations_to_convert_time;

// #Easy #String #Greedy #2022_06_12_Time_2_ms_(68.74%)_Space_42.3_MB_(47.60%)

public class Solution {
    public int convertTime(String current, String correct) {
        int curr = Integer.parseInt(current.substring(0, 2));
        curr = curr * 60;
        curr += Integer.parseInt(current.substring(3));

        int corr =
                (Integer.parseInt(correct.substring(0, 2)) * 60)
                        + (Integer.parseInt(correct.substring(3)));

        int diff = corr - curr;
        int step = 0;

        if (diff % 60 == 0) {
            step = diff / 60;
            return step;
        } else {
            step = diff / 60;
            diff = diff % 60;
        }

        if (diff >= 15) {
            if (diff % 15 == 0) {
                step += diff / 15;
                return step;
            } else {
                step += diff / 15;
                diff = diff % 15;
            }
        }

        if (diff >= 5) {
            if (diff % 5 == 0) {
                step += diff / 5;
                return step;
            } else {
                step += diff / 5;
                diff = diff % 5;
            }
        }

        step += diff;

        return step;
    }
}
