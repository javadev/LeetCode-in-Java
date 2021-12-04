package g0001_0100.s0022_generate_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void generateParenthesis() {
        assertThat(
                new Solution().generateParenthesis(3),
                equalTo(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")));
    }
}
