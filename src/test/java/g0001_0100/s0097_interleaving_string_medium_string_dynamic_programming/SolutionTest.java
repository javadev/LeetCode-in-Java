package g0001_0100.s0097_interleaving_string_medium_string_dynamic_programming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isInterleave() {
        assertThat(new Solution().isInterleave("aabcc", "dbbca", "aadbbcbcac"), equalTo(true));
        assertThat(new Solution().isInterleave("aabcc", "dbbca", "aadbbbaccc"), equalTo(false));
        assertThat(new Solution().isInterleave("", "", ""), equalTo(true));
    }
}
