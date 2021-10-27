package s0020_valid_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isValid() {
        assertThat(new Solution().isValid("()"), equalTo(true));
    }
}
