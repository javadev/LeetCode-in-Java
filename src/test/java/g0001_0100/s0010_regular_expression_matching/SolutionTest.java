package g0001_0100.s0010_regular_expression_matching;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isMatch() {
        assertThat(new Solution().isMatch("aa", "a"), equalTo(false));
    }
}
