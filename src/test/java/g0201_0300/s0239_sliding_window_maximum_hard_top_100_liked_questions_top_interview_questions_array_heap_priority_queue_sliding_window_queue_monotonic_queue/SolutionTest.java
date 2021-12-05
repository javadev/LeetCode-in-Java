package g0201_0300.s0239_sliding_window_maximum_hard_top_100_liked_questions_top_interview_questions_array_heap_priority_queue_sliding_window_queue_monotonic_queue;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxSlidingWindow() {
        assertThat(
                new Solution().maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3),
                equalTo(new int[] {3, 3, 5, 5, 6, 7}));
    }
}
