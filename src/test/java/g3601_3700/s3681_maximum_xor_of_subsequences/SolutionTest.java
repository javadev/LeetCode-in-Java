package g3601_3700.s3681_maximum_xor_of_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxXorSubsequences() {
        assertThat(new Solution().maxXorSubsequences(new int[] {1, 2, 3}), equalTo(3));
    }

    @Test
    void maxXorSubsequences2() {
        assertThat(new Solution().maxXorSubsequences(new int[] {5, 2}), equalTo(7));
    }
}
