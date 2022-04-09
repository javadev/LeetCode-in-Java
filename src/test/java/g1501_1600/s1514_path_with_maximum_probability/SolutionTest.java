package g1501_1600.s1514_path_with_maximum_probability;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProbability() {
        assertThat(
                new Solution()
                        .maxProbability(
                                3,
                                new int[][] {{0, 1}, {1, 2}, {0, 2}},
                                new double[] {0.5, 0.5, 0.2},
                                0,
                                2),
                equalTo(0.2500));
    }

    @Test
    void maxProbability2() {
        assertThat(
                new Solution()
                        .maxProbability(
                                3,
                                new int[][] {{0, 1}, {1, 2}, {0, 2}},
                                new double[] {0.5, 0.5, 0.3},
                                0,
                                2),
                equalTo(0.3));
    }

    @Test
    void maxProbability3() {
        assertThat(
                new Solution().maxProbability(3, new int[][] {{0, 1}}, new double[] {0.5}, 0, 2),
                equalTo(0.0));
    }
}
