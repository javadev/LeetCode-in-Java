package g1701_1800.s1751_maximum_number_of_events_that_can_be_attended_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValue() {
        assertThat(
                new Solution().maxValue(new int[][] {{1, 2, 4}, {3, 4, 3}, {2, 3, 1}}, 2),
                equalTo(7));
    }

    @Test
    void maxValue2() {
        assertThat(
                new Solution().maxValue(new int[][] {{1, 2, 4}, {3, 4, 3}, {2, 3, 10}}, 2),
                equalTo(10));
    }

    @Test
    void maxValue3() {
        assertThat(
                new Solution()
                        .maxValue(new int[][] {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}}, 3),
                equalTo(9));
    }
}
