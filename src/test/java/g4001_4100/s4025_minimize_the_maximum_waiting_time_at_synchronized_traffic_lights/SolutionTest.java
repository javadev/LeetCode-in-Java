package g4001_4100.s4025_minimize_the_maximum_waiting_time_at_synchronized_traffic_lights;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPenalty() {
        assertThat(
                new Solution().minPenalty(10, new int[] {3, 5}, new int[] {1, 2, 8}), equalTo(2));
    }

    @Test
    void minPenalty2() {
        assertThat(new Solution().minPenalty(10, new int[] {3}, new int[] {1, 2, 3}), equalTo(7));
    }

    @Test
    void minPenalty3() {
        assertThat(new Solution().minPenalty(10, new int[] {3}, new int[] {13, 18}), equalTo(7));
    }
}
