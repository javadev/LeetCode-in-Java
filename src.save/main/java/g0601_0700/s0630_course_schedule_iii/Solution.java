package g0601_0700.s0630_course_schedule_iii;

// #Hard #Array #Greedy #Heap_Priority_Queue #2022_03_21_Time_53_ms_(58.83%)_Space_69.7_MB_(56.35%)

import java.util.Arrays;
import java.util.PriorityQueue;

@SuppressWarnings("java:S135")
public class Solution {
    public int scheduleCourse(int[][] courses) {
        // Sort the courses based on their deadline date.
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        // Only the duration is stored. We don't care which course
        // is the longest, we only care about the total courses can
        // be taken.
        // If the question wants the course ids to be returned.
        // Consider use a Pair<Duration, CourseId> int pair.
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        // Total time consumed.
        int time = 0;
        // At the given time `course`, the overall "time limit" is
        // course[1]. All courses in pq is already 'valid'. But
        // adding this course[0] might exceed the course[1] limit.
        for (int[] course : courses) {
            // If adding this course doesn't exceed. Let's add it
            // for now. (Greedy algo). We might remove it later if
            // we have a "better" solution at that time.
            if (time + course[0] <= course[1]) {
                time += course[0];
                pq.offer(course[0]);
            } else {
                // If adding this ecxeeds the limit. We can still add it
                // if-and-only-if there are courses longer than current
                // one. If so, by removing a longer course, current shorter
                // course can fit in for sure. Although the total course
                // count is the same, the overall time consumed is shorter.
                // Which gives us more room for future courses.
                // Remove any course that is longer than current course
                // will work, but we remove the longest one with the help
                // of heap (pq).
                if (!pq.isEmpty() && pq.peek() > course[0]) {
                    time -= pq.poll();
                    time += course[0];
                    pq.offer(course[0]);
                }
                // If no course in consider (pq) is shorter than the
                // current course. It is safe to discard it.
            }
        }
        return pq.size();
    }
}
