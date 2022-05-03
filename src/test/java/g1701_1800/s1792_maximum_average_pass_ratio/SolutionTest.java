package g1701_1800.s1792_maximum_average_pass_ratio;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAverageRatio() {
        assertThat(
                new Solution().maxAverageRatio(new int[][] {{1, 2}, {3, 5}, {2, 2}}, 2),
                equalTo(0.7833333333333333));
    }

    @Test
    void maxAverageRatio2() {
        assertThat(
                new Solution().maxAverageRatio(new int[][] {{2, 4}, {3, 9}, {4, 5}, {2, 10}}, 4),
                equalTo(0.5348484848484849));
    }
}
