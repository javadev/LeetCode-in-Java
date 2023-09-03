package g0701_0800.s0724_find_pivot_index;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pivotIndex() {
        assertThat(new Solution().pivotIndex(new int[] {1, 7, 3, 6, 5, 6}), equalTo(3));
    }

    @Test
    void pivotIndex2() {
        assertThat(new Solution().pivotIndex(new int[] {1, 2, 3}), equalTo(-1));
    }

    @Test
    void pivotIndex3() {
        assertThat(new Solution().pivotIndex(new int[] {2, 1, -1}), equalTo(0));
    }
}
