package g1801_1900.s1814_count_nice_pairs_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countNicePairs() {
        assertThat(new Solution().countNicePairs(new int[] {42, 11, 1, 97}), equalTo(2));
    }

    @Test
    void countNicePairs2() {
        assertThat(new Solution().countNicePairs(new int[] {13, 10, 35, 24, 76}), equalTo(4));
    }
}
