package g0501_0600.s0517_super_washing_machines;

// #Hard #Array #Greedy #2022_07_25_Time_1_ms_(94.02%)_Space_45.5_MB_(67.39%)

public class Solution {
    public int findMinMoves(int[] machines) {
        int total = 0;
        for (int i : machines) {
            total += i;
        }
        if (total % machines.length != 0) {
            return -1;
        }
        int avg = total / machines.length;
        int cnt = 0;
        int max = 0;
        for (int load : machines) {
            cnt += load - avg;
            max = Math.max(Math.max(max, Math.abs(cnt)), load - avg);
        }
        return max;
    }
}
