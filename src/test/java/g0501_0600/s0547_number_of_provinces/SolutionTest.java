package g0501_0600.s0547_number_of_provinces;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findCircleNum() {
        assertThat(
                new Solution().findCircleNum(new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}),
                equalTo(2));
    }

    @Test
    void findCircleNum2() {
        assertThat(
                new Solution().findCircleNum(new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}),
                equalTo(3));
    }
}
