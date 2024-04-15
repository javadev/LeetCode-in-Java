package g0801_0900.s0868_binary_gap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void binaryGap() {
        assertThat(new Solution().binaryGap(22), equalTo(2));
    }

    @Test
    void binaryGap2() {
        assertThat(new Solution().binaryGap(8), equalTo(0));
    }

    @Test
    void binaryGap3() {
        assertThat(new Solution().binaryGap(5), equalTo(2));
    }
}
