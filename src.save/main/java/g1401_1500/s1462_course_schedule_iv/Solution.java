package g1401_1500.s1462_course_schedule_iv;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort
// #2022_03_29_Time_10_ms_(100.00%)_Space_46.3_MB_(94.57%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution {
    public List<Boolean> checkIfPrerequisite(
            int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer, List<Integer>> m = new HashMap<>();
        int[] ind = new int[numCourses];
        for (int[] p : prerequisites) {
            m.computeIfAbsent(p[1], o -> new ArrayList<>()).add(p[0]);
            ind[p[0]]++;
        }
        boolean[][] r = new boolean[numCourses][numCourses];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (ind[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int j = q.poll();
            for (int k : m.getOrDefault(j, new ArrayList<>())) {
                r[k][j] = true;
                for (int l = 0; l < r.length; l++) {
                    if (r[j][l]) {
                        r[k][l] = true;
                    }
                }
                ind[k]--;
                if (ind[k] == 0) {
                    q.offer(k);
                }
            }
        }
        List<Boolean> a = new ArrayList<>();
        for (int[] qr : queries) {
            a.add(r[qr[0]][qr[1]]);
        }
        return a;
    }
}
