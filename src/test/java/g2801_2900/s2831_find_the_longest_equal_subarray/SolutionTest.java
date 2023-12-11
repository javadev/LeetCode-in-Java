package g2801_2900.s2831_find_the_longest_equal_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestEqualSubarray() {
        assertThat(
                new Solution().longestEqualSubarray(Arrays.asList(1, 3, 2, 3, 1, 3), 3),
                equalTo(3));
    }

    @Test
    void longestEqualSubarray2() {
        assertThat(
                new Solution().longestEqualSubarray(Arrays.asList(1, 1, 2, 2, 1, 1), 2),
                equalTo(4));
    }
}
