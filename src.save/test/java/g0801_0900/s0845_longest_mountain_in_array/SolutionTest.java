package g0801_0900.s0845_longest_mountain_in_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestMountain() {
        assertThat(new Solution().longestMountain(new int[] {2, 1, 4, 7, 3, 2, 5}), equalTo(5));
    }

    @Test
    void longestMountain2() {
        assertThat(new Solution().longestMountain(new int[] {2, 2, 2}), equalTo(0));
    }
}
