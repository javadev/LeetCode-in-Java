package g0001_0100.s0071_simplify_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void simplifyPath() {
        assertThat(new Solution().simplifyPath("/home/"), equalTo("/home"));
    }
}
