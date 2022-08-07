package g2301_2400.s2354_number_of_excellent_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countExcellentPairs() {
        assertThat(new Solution().countExcellentPairs(new int[] {1, 2, 3, 1}, 3), equalTo(5L));
    }

    @Test
    void countExcellentPairs2() {
        assertThat(new Solution().countExcellentPairs(new int[] {5, 1, 1}, 10), equalTo(0L));
    }
}
