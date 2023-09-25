package g2301_2400.s2392_build_a_matrix_with_conditions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void buildMatrix() {
        assertThat(
                new Solution()
                        .buildMatrix(3, new int[][] {{1, 2}, {3, 2}}, new int[][] {{2, 1}, {3, 2}}),
                equalTo(new int[][] {{0, 0, 1}, {3, 0, 0}, {0, 2, 0}}));
    }

    @Test
    void buildMatrix2() {
        assertThat(
                new Solution()
                        .buildMatrix(
                                3,
                                new int[][] {{1, 2}, {2, 3}, {3, 1}, {2, 3}},
                                new int[][] {{2, 1}}),
                equalTo(new int[][] {}));
    }
}
