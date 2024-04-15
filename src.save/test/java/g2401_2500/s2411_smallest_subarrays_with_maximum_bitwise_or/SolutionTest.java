package g2401_2500.s2411_smallest_subarrays_with_maximum_bitwise_or;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestSubarrays() {
        assertThat(
                new Solution().smallestSubarrays(new int[] {1, 0, 2, 1, 3}),
                equalTo(new int[] {3, 3, 2, 2, 1}));
    }

    @Test
    void smallestSubarrays2() {
        assertThat(new Solution().smallestSubarrays(new int[] {1, 2}), equalTo(new int[] {2, 1}));
    }
}
