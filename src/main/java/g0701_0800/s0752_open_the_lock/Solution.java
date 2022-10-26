package g0701_0800.s0752_open_the_lock;

// #Medium #Array #String #Hash_Table #Breadth_First_Search
// #Graph_Theory_I_Day_12_Breadth_First_Search
// #2022_03_25_Time_72_ms_(91.06%)_Space_69.8_MB_(69.73%)

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int openLock(String[] deadEnds, String target) {
        Set<Integer> visited = new HashSet<>();
        for (String end : deadEnds) {
            visited.add(Integer.parseInt(end));
        }
        if (visited.contains(0)) {
            return -1;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        visited.add(0);
        int numTarget = Integer.parseInt(target);
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int number = node[0];
            int dist = node[1];
            if (number == numTarget) {
                return dist;
            }
            int[] neighbors = getNeighbors(number);
            for (int neighbor : neighbors) {
                if (visited.contains(neighbor)) {
                    continue;
                }
                visited.add(neighbor);
                queue.add(new int[] {neighbor, dist + 1});
            }
        }
        return -1;
    }

    private int[] getNeighbors(int number) {
        int[] neighbors = new int[8];
        int index = 0;
        int ten = 10;
        for (int i = 1; i <= 4; i++) {
            neighbors[index++] = (number / ten) * ten + (number + ten / 10) % ten;
            neighbors[index++] = (number / ten) * ten + (number + 9 * (ten / 10)) % ten;
            ten *= 10;
        }
        return neighbors;
    }
}
