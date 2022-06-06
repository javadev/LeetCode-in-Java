package g2101_2200.s2176_count_equal_and_divisible_pairs_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(new Solution().countPairs(new int[] {3, 1, 2, 2, 2, 1, 3}, 2), equalTo(4));
    }

    @Test
    void countPairs2() {
        assertThat(new Solution().countPairs(new int[] {1, 2, 3, 4}, 1), equalTo(0));
    }
}
