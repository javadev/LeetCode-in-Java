package g0101_0200.s0136_single_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void singleNumber() {
        assertThat(new Solution().singleNumber(new int[] {2, 2, 1}), equalTo(1));
    }

    @Test
    void singleNumber2() {
        assertThat(new Solution().singleNumber(new int[] {4, 1, 2, 1, 2}), equalTo(4));
    }

    @Test
    void singleNumber3() {
        assertThat(new Solution().singleNumber(new int[] {1}), equalTo(1));
    }
}
