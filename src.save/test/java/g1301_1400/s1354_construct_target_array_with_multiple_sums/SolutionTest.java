package g1301_1400.s1354_construct_target_array_with_multiple_sums;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPossible() {
        assertThat(new Solution().isPossible(new int[] {9, 3, 5}), equalTo(true));
    }

    @Test
    void isPossible2() {
        assertThat(new Solution().isPossible(new int[] {1, 1, 1, 2}), equalTo(false));
    }

    @Test
    void isPossible3() {
        assertThat(new Solution().isPossible(new int[] {8, 5}), equalTo(true));
    }
}
