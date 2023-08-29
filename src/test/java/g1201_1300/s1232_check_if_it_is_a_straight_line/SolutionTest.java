package g1201_1300.s1232_check_if_it_is_a_straight_line;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkStraightLine() {
        assertThat(
                new Solution()
                        .checkStraightLine(
                                new int[][] {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}),
                equalTo(true));
    }

    @Test
    void checkStraightLine2() {
        assertThat(
                new Solution()
                        .checkStraightLine(
                                new int[][] {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}}),
                equalTo(false));
    }
}
