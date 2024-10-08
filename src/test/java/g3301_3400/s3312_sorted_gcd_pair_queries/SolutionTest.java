package g3301_3400.s3312_sorted_gcd_pair_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void gcdValues() {
        assertThat(
                new Solution().gcdValues(new int[] {2, 3, 4}, new long[] {0L, 2L, 2L}),
                equalTo(new int[] {1, 2, 2}));
    }

    @Test
    void gcdValues2() {
        assertThat(
                new Solution().gcdValues(new int[] {4, 4, 2, 1}, new long[] {5L, 3L, 1L, 0L}),
                equalTo(new int[] {4, 2, 1, 1}));
    }
}
