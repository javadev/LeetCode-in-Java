package g0901_1000.s0956_tallest_billboard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void tallestBillboard() {
        assertThat(new Solution().tallestBillboard(new int[] {1, 2, 3, 6}), equalTo(6));
    }

    @Test
    void tallestBillboard2() {
        assertThat(new Solution().tallestBillboard(new int[] {1, 2, 3, 4, 5, 6}), equalTo(10));
    }

    @Test
    void tallestBillboard3() {
        assertThat(new Solution().tallestBillboard(new int[] {1, 2}), equalTo(0));
    }
}
