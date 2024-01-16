package g2601_2700.s2615_sum_of_distances;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distance() {
        assertThat(
                new Solution().distance(new int[] {1, 3, 1, 1, 2}),
                equalTo(new long[] {5, 0, 3, 4, 0}));
    }

    @Test
    void distance2() {
        assertThat(new Solution().distance(new int[] {0, 5, 3}), equalTo(new long[] {0, 0, 0}));
    }
}
