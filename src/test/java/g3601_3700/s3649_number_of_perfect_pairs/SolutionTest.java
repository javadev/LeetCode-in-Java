package g3601_3700.s3649_number_of_perfect_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void perfectPairs() {
        assertThat(new Solution().perfectPairs(new int[] {0, 1, 2, 3}), equalTo(2L));
    }

    @Test
    void perfectPairs2() {
        assertThat(new Solution().perfectPairs(new int[] {-3, 2, -1, 4}), equalTo(4L));
    }

    @Test
    void perfectPairs3() {
        assertThat(new Solution().perfectPairs(new int[] {1, 10, 100, 1000}), equalTo(0L));
    }
}
