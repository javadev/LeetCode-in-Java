package g0501_0600.s0525_contiguous_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxLength() {
        assertThat(new Solution().findMaxLength(new int[] {0, 1}), equalTo(2));
    }

    @Test
    void findMaxLength2() {
        assertThat(new Solution().findMaxLength(new int[] {0, 1, 0}), equalTo(2));
    }
}
