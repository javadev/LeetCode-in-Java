package g2001_2100.s2045_second_minimum_time_to_reach_destination;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void secondMinimum() {
        assertThat(
                new Solution()
                        .secondMinimum(
                                5, new int[][] {{1, 2}, {1, 3}, {1, 4}, {3, 4}, {4, 5}}, 3, 5),
                equalTo(13));
    }

    @Test
    void secondMinimum2() {
        assertThat(new Solution().secondMinimum(2, new int[][] {{1, 2}}, 3, 2), equalTo(11));
    }
}
