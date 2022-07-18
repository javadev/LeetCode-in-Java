package g2301_2400.s2341_maximum_number_of_pairs_in_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfPairs() {
        assertThat(
                new Solution().numberOfPairs(new int[] {1, 3, 2, 1, 3, 2, 2}),
                equalTo(new int[] {3, 1}));
    }

    @Test
    void numberOfPairs2() {
        assertThat(new Solution().numberOfPairs(new int[] {1, 1}), equalTo(new int[] {1, 0}));
    }

    @Test
    void numberOfPairs3() {
        assertThat(new Solution().numberOfPairs(new int[] {0}), equalTo(new int[] {0, 1}));
    }
}
