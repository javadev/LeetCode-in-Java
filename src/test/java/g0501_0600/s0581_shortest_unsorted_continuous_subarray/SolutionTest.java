package g0501_0600.s0581_shortest_unsorted_continuous_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findUnsortedSubarray() {
        assertThat(
                new Solution().findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15}), equalTo(5));
    }

    @Test
    void findUnsortedSubarray2() {
        assertThat(new Solution().findUnsortedSubarray(new int[] {1, 2, 3, 4}), equalTo(0));
    }

    @Test
    void findUnsortedSubarray3() {
        assertThat(new Solution().findUnsortedSubarray(new int[] {1}), equalTo(0));
    }
}
