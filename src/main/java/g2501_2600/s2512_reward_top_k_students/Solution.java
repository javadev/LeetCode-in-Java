package g2501_2600.s2512_reward_top_k_students;

// #Medium #Array #String #Hash_Table #Sorting #Heap_Priority_Queue
// #2023_03_21_Time_72_ms_(94.76%)_Space_51.1_MB_(21.67%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public List<Integer> topStudents(
            String[] positiveFeedback,
            String[] negativeFeedback,
            String[] report,
            int[] studentId,
            int k) {
        HashMap<String, Integer> feedback = new HashMap<>();
        for (String s : positiveFeedback) {
            feedback.put(s, 3);
        }
        for (String s : negativeFeedback) {
            feedback.put(s, -1);
        }
        PriorityQueue<Student> pq =
                new PriorityQueue<>(
                        (a, b) -> {
                            int result = Integer.compare(a.points, b.points);
                            return result == 0 ? Integer.compare(a.id, b.id) : -result;
                        });
        for (int i = 0; i < report.length; i++) {
            String[] split = report[i].split(" ");
            int sum = 0;
            for (String subStr : split) {
                sum += feedback.getOrDefault(subStr, 0);
            }
            pq.offer(new Student(studentId[i], sum));
        }
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty() && k-- > 0) {
            result.add(pq.poll().id);
        }
        return result;
    }

    private static class Student {
        int points;
        int id;

        public Student(int id, int points) {
            this.id = id;
            this.points = points;
        }
    }
}
