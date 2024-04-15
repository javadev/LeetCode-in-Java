package g0401_0500.s0414_third_maximum_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void thirdMax() {
        assertThat(new Solution().thirdMax(new int[] {3, 2, 1}), equalTo(1));
    }

    @Test
    void thirdMax2() {
        assertThat(new Solution().thirdMax(new int[] {1, 2}), equalTo(2));
    }
}
