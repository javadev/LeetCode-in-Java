package g2701_2800.s2762_continuous_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void continuousSubarrays() {
        assertThat(new Solution().continuousSubarrays(new int[] {5, 4, 2, 4}), equalTo(8L));
    }

    @Test
    void continuousSubarrays2() {
        assertThat(new Solution().continuousSubarrays(new int[] {1, 2, 3}), equalTo(6L));
    }
}
