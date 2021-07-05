package s0010.regular.expression.matching;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isMatch() {
        assertThat(new Solution().isMatch("aa", "a"), equalTo(false));
    }
}
