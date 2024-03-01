package g0801_0900.s0869_reordered_power_of_2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reorderedPowerOf2() {
        assertThat(new Solution().reorderedPowerOf2(1), equalTo(true));
    }

    @Test
    void reorderedPowerOf22() {
        assertThat(new Solution().reorderedPowerOf2(10), equalTo(false));
    }
}
