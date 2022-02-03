package g0801_0900.s0891_sum_of_subsequence_widths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumSubseqWidths() {
        assertThat(new Solution().sumSubseqWidths(new int[] {2, 1, 3}), equalTo(6));
    }

    @Test
    void sumSubseqWidths2() {
        assertThat(new Solution().sumSubseqWidths(new int[] {2}), equalTo(0));
    }
}
