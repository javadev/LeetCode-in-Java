package g2201_2300.s2232_minimize_result_by_adding_parentheses_to_expression;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizeResult() {
        assertThat(new Solution().minimizeResult("247+38"), equalTo("2(47+38)"));
    }

    @Test
    void minimizeResult2() {
        assertThat(new Solution().minimizeResult("12+34"), equalTo("1(2+3)4"));
    }

    @Test
    void minimizeResult3() {
        assertThat(new Solution().minimizeResult("999+999"), equalTo("(999+999)"));
    }
}
