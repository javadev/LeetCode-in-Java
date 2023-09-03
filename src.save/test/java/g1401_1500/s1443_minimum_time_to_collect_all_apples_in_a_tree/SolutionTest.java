package g1401_1500.s1443_minimum_time_to_collect_all_apples_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTime() {
        assertThat(
                new Solution()
                        .minTime(
                                7,
                                new int[][] {{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}},
                                Arrays.asList(false, false, true, false, true, true, false)),
                equalTo(8));
    }

    @Test
    void minTime2() {
        assertThat(
                new Solution()
                        .minTime(
                                7,
                                new int[][] {{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}},
                                Arrays.asList(false, false, true, false, false, true, false)),
                equalTo(6));
    }

    @Test
    void minTime3() {
        assertThat(
                new Solution()
                        .minTime(
                                7,
                                new int[][] {{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}},
                                Arrays.asList(false, false, false, false, false, false, false)),
                equalTo(0));
    }
}
