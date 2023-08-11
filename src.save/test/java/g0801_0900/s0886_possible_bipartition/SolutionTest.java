package g0801_0900.s0886_possible_bipartition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void possibleBipartition() {
        assertThat(
                new Solution().possibleBipartition(4, new int[][] {{1, 2}, {1, 3}, {2, 4}}),
                equalTo(true));
    }

    @Test
    void possibleBipartition2() {
        assertThat(
                new Solution().possibleBipartition(3, new int[][] {{1, 2}, {1, 3}, {2, 3}}),
                equalTo(false));
    }

    @Test
    void possibleBipartition3() {
        assertThat(
                new Solution()
                        .possibleBipartition(
                                5, new int[][] {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}}),
                equalTo(false));
    }
}
