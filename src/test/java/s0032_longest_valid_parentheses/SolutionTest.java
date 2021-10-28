package s0032_longest_valid_parentheses;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestValidParentheses() {
        Assert.assertEquals(2, new Solution().longestValidParentheses("(()"));
    }
}
