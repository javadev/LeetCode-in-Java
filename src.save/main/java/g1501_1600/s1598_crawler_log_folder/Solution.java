package g1501_1600.s1598_crawler_log_folder;

// #Easy #Array #String #Stack #2022_04_08_Time_0_ms_(100.00%)_Space_42_MB_(81.44%)

public class Solution {
    public int minOperations(String[] logs) {
        int steps = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (steps > 0) {
                    steps--;
                }
            } else if (!log.equals("./")) {
                steps++;
            }
        }
        return steps;
    }
}
