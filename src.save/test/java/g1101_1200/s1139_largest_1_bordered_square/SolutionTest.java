package g1101_1200.s1139_largest_1_bordered_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largest1BorderedSquare() {
        assertThat(
                new Solution()
                        .largest1BorderedSquare(new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}),
                equalTo(9));
    }

    @Test
    void largest1BorderedSquare2() {
        assertThat(new Solution().largest1BorderedSquare(new int[][] {{1, 1, 0, 0}}), equalTo(1));
    }
}
