package g1301_1400.s1376_time_needed_to_inform_all_employees;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Programming_Skills_II_Day_11
// #Graph_Theory_I_Day_9_Standard_Traversal #2023_09_03_Time_8_ms_(99.85%)_Space_58_MB_(89.47%)

@SuppressWarnings("java:S1172")
public class Solution {
    private int numMinsDFS(int index, int[] manager, int[] informTime) {
        if (manager[index] != -1) {
            informTime[index] += numMinsDFS(manager[index], manager, informTime);
            manager[index] = -1;
        }
        return informTime[index];
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int time = informTime[headID];
        for (int i = 0; i < n; i++) {
            if (informTime[i] == 0) {
                continue;
            }
            int timei = numMinsDFS(i, manager, informTime);
            if (timei > time) {
                time = timei;
            }
        }
        return time;
    }
}
