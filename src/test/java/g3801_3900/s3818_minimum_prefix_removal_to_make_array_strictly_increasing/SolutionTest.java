package g3801_3900.s3818_minimum_prefix_removal_to_make_array_strictly_increasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumPrefixLength() {
        assertThat(
                new Solution().minimumPrefixLength(new int[] {1, -1, 2, 3, 3, 4, 5}), equalTo(4));
    }

    @Test
    void minimumPrefixLength2() {
        assertThat(new Solution().minimumPrefixLength(new int[] {4, 3, -2, -5}), equalTo(3));
    }

    @Test
    void minimumPrefixLength3() {
        assertThat(new Solution().minimumPrefixLength(new int[] {1, 2, 3, 4}), equalTo(0));
    }
}
