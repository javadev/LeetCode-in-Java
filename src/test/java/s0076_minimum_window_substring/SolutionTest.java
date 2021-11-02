package s0076_minimum_window_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void minWindow() {
        assertThat(new Solution().minWindow("ADOBECODEBANC", "ABC"), equalTo("BANC"));
    }
}
