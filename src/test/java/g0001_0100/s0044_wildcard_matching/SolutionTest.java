package g0001_0100.s0044_wildcard_matching;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void isMatch() {
        Solution solution = new Solution();
        assertThat(solution.isMatch("aa", "a"), equalTo(false));
        assertThat(solution.isMatch("aa", "*"), equalTo(true));
        assertThat(solution.isMatch("cb", "?a"), equalTo(false));
        assertThat(solution.isMatch("adceb", "*a*b"), equalTo(true));
        assertThat(solution.isMatch("acdcb", "a*c?b"), equalTo(false));
    }
}
