package g2701_2800.s2765_longest_alternating_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void alternatingSubarray() {
        assertThat(new Solution().alternatingSubarray(new int[] {2, 3, 4, 3, 4}), equalTo(4));
    }

    @Test
    void alternatingSubarray2() {
        assertThat(new Solution().alternatingSubarray(new int[] {4, 5, 6}), equalTo(2));
    }
}
