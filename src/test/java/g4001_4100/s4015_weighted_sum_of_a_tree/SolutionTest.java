package g4001_4100.s4015_weighted_sum_of_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void weightedSum() {
        assertThat(
                new Solution()
                        .weightedSum(new int[] {-1, 0, 0, 0, 2, 2}, new int[] {5, 2, 3, 1, 4, 6}),
                equalTo(37L));
    }

    @Test
    void weightedSum2() {
        assertThat(
                new Solution().weightedSum(new int[] {-1, 0, 1, 2}, new int[] {1, 2, 3, 4}),
                equalTo(20L));
    }
}
