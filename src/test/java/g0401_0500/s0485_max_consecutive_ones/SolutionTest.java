package g0401_0500.s0485_max_consecutive_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxConsecutiveOnes() {
        assertThat(new Solution().findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}), equalTo(3));
    }

    @Test
    void findMaxConsecutiveOnes2() {
        assertThat(new Solution().findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1}), equalTo(2));
    }
}
