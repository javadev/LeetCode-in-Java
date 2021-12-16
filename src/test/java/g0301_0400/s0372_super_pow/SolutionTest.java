package g0301_0400.s0372_super_pow;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void superPow() {
        assertThat(new Solution().superPow(2, new int[] {3}), equalTo(8));
    }

    @Test
    void superPow2() {
        assertThat(new Solution().superPow(2, new int[] {1, 0}), equalTo(1024));
    }

    @Test
    void superPow3() {
        assertThat(new Solution().superPow(1, new int[] {4, 3, 3, 8, 5, 2}), equalTo(1));
    }

    @Test
    void superPow4() {
        assertThat(new Solution().superPow(2147483647, new int[] {2, 0, 0}), equalTo(1198));
    }
}
