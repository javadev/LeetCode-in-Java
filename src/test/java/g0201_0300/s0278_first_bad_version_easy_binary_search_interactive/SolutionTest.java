package g0201_0300.s0278_first_bad_version_easy_binary_search_interactive;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void firstBadVersion() {
        assertThat(new Solution().firstBadVersion(5), equalTo(4));
    }
}
