package g0101_0200.s0115_distinct_subsequences_hard_string_dynamic_programming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void distinctSubsequences() {
        assertThat(new Solution().numDistinct("rabbbit", "rabbit"), equalTo(3));
    }
}
