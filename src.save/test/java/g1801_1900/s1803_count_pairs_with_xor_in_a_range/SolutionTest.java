package g1801_1900.s1803_count_pairs_with_xor_in_a_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(new Solution().countPairs(new int[] {1, 4, 2, 7}, 2, 6), equalTo(6));
    }

    @Test
    void countPairs2() {
        assertThat(new Solution().countPairs(new int[] {9, 8, 4, 2, 1}, 5, 14), equalTo(8));
    }
}
