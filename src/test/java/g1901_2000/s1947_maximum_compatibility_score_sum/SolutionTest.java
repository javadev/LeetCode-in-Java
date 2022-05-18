package g1901_2000.s1947_maximum_compatibility_score_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxCompatibilitySum() {
        assertThat(
                new Solution()
                        .maxCompatibilitySum(
                                new int[][] {{1, 1, 0}, {1, 0, 1}, {0, 0, 1}},
                                new int[][] {{1, 0, 0}, {0, 0, 1}, {1, 1, 0}}),
                equalTo(8));
    }

    @Test
    void maxCompatibilitySum2() {
        assertThat(
                new Solution()
                        .maxCompatibilitySum(
                                new int[][] {{0, 0}, {0, 0}, {0, 0}},
                                new int[][] {{1, 1}, {1, 1}, {1, 1}}),
                equalTo(0));
    }
}
