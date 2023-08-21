package g2501_2600.s2563_count_the_number_of_fair_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countFairPairs() {
        assertThat(new Solution().countFairPairs(new int[] {0, 1, 7, 4, 4, 5}, 3, 6), equalTo(6L));
    }

    @Test
    void countFairPairs2() {
        assertThat(new Solution().countFairPairs(new int[] {1, 7, 9, 2, 5}, 11, 11), equalTo(1L));
    }
}
