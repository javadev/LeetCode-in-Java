package g2901_3000.s2945_find_maximum_non_decreasing_array_length;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaximumLength() {
        assertThat(new Solution().findMaximumLength(new int[] {5, 2, 2}), equalTo(1));
    }

    @Test
    void findMaximumLength2() {
        assertThat(new Solution().findMaximumLength(new int[] {1, 2, 3, 4}), equalTo(4));
    }

    @Test
    void findMaximumLength3() {
        assertThat(new Solution().findMaximumLength(new int[] {4, 3, 2, 6}), equalTo(3));
    }
}
