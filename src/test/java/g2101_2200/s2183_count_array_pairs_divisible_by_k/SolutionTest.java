package g2101_2200.s2183_count_array_pairs_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(new Solution().countPairs(new int[] {1, 2, 3, 4, 5}, 2), equalTo(7L));
    }

    @Test
    void countPairs2() {
        assertThat(new Solution().countPairs(new int[] {1, 2, 3, 4}, 5), equalTo(0L));
    }
}
