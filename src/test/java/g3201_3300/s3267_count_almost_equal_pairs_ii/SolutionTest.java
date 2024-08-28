package g3201_3300.s3267_count_almost_equal_pairs_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(new Solution().countPairs(new int[] {1023, 2310, 2130, 213}), equalTo(4));
    }

    @Test
    void countPairs2() {
        assertThat(new Solution().countPairs(new int[] {1, 10, 100}), equalTo(3));
    }
}
