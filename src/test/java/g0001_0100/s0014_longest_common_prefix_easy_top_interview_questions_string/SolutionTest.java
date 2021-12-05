package g0001_0100.s0014_longest_common_prefix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestCommonPrefix() {
        assertThat(
                new Solution().longestCommonPrefix(new String[] {"flower", "flow", "flight"}),
                equalTo("fl"));
    }
}
