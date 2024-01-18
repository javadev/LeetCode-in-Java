package g1301_1400.s1353_maximum_number_of_events_that_can_be_attended;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxEvents() {
        assertThat(new Solution().maxEvents(new int[][] {{1, 2}, {2, 3}, {3, 4}}), equalTo(3));
    }

    @Test
    void maxEvents2() {
        assertThat(
                new Solution().maxEvents(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 2}}), equalTo(4));
    }
}
