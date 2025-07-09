package g2301_2400.s2365_task_scheduler_ii;

// #Medium #Array #Hash_Table #Simulation #2022_08_14_Time_70_ms_(55.56%)_Space_123.3_MB_(11.11%)

import java.util.HashMap;

public class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        long days = 0;
        space++;
        HashMap<Integer, Long> lastOccurence = new HashMap<>();
        for (int task : tasks) {
            if (lastOccurence.containsKey(task)) {
                long lastTimeOccurred = lastOccurence.get(task);
                long daysDifference = days - lastTimeOccurred;
                if (daysDifference < space) {
                    days += (space - daysDifference);
                }
            }
            lastOccurence.put(task, days);
            days++;
        }
        return days;
    }
}
