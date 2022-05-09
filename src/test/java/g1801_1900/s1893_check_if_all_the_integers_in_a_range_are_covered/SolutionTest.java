package g1801_1900.s1893_check_if_all_the_integers_in_a_range_are_covered;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isCovered() {
        assertThat(
                new Solution().isCovered(new int[][] {{1, 2}, {3, 4}, {5, 6}}, 2, 5),
                equalTo(true));
    }

    @Test
    void isCovered2() {
        assertThat(
                new Solution().isCovered(new int[][] {{1, 10}, {10, 20}}, 21, 21), equalTo(false));
    }
}
