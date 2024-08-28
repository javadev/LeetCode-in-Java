package g3201_3300.s3265_count_almost_equal_pairs_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(new Solution().countPairs(new int[] {3, 12, 30, 17, 21}), equalTo(2));
    }

    @Test
    void countPairs2() {
        assertThat(new Solution().countPairs(new int[] {1, 1, 1, 1, 1}), equalTo(10));
    }

    @Test
    void countPairs3() {
        assertThat(new Solution().countPairs(new int[] {123, 231}), equalTo(0));
    }
}
