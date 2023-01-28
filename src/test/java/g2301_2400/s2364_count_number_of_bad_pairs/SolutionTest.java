package g2301_2400.s2364_count_number_of_bad_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBadPairs() {
        assertThat(new Solution().countBadPairs(new int[] {4, 1, 3, 3}), equalTo(5L));
    }

    @Test
    void countBadPairs2() {
        assertThat(new Solution().countBadPairs(new int[] {1, 2, 3, 4, 5}), equalTo(0L));
    }
}
