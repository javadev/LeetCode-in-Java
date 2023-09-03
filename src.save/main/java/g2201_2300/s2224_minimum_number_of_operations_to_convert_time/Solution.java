package g2201_2300.s2224_minimum_number_of_operations_to_convert_time;

// #Easy #String #Greedy #2022_06_12_Time_1_ms_(97.78%)_Space_42.7_MB_(18.92%)

public class Solution {
    private int[] duration = {60, 15, 5, 1};
    private int c = 0;

    public int convertTime(String current, String correct) {
        int dmin = Integer.parseInt(correct.substring(3)) - Integer.parseInt(current.substring(3));
        int dhour =
                Integer.parseInt(correct.substring(0, 2))
                        - Integer.parseInt(current.substring(0, 2));
        int min = dhour * 60 + dmin;
        dfs(0, min);
        return c;
    }

    private void dfs(int i, int amount) {
        if (i == 4) {
            return;
        }
        if (amount == 0) {
            return;
        }
        if ((amount - duration[i]) >= 0) {
            c++;
            dfs(i, amount - duration[i]);
        } else {
            dfs(i + 1, amount);
        }
    }
}
