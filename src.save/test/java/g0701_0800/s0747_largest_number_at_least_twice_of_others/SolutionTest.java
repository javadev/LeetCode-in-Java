package g0701_0800.s0747_largest_number_at_least_twice_of_others;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void dominantIndex() {
        assertThat(new Solution().dominantIndex(new int[] {3, 6, 1, 0}), equalTo(1));
    }

    @Test
    void dominantIndex2() {
        assertThat(new Solution().dominantIndex(new int[] {1, 2, 3, 4}), equalTo(-1));
    }

    @Test
    void dominantIndex3() {
        assertThat(new Solution().dominantIndex(new int[] {1}), equalTo(0));
    }
}
