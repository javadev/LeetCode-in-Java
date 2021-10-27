package s0022_generate_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void generateParenthesis() {
        assertThat(
                new Solution().generateParenthesis(3).toString(),
                equalTo("[((())), (()()), (())(), ()(()), ()()()]"));
    }
}
