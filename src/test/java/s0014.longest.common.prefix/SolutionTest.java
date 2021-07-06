package s0014.longest.common.prefix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void romanToInt() {
        assertThat(
                new Solution().longestCommonPrefix(new String[] {"flower", "flow", "flight"}),
                equalTo("fl"));
    }
}
