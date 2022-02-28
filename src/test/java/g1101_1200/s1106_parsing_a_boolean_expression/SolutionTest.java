package g1101_1200.s1106_parsing_a_boolean_expression;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void parseBoolExpr() {
        assertThat(new Solution().parseBoolExpr("!(f)"), equalTo(true));
    }

    @Test
    void parseBoolExpr2() {
        assertThat(new Solution().parseBoolExpr("|(f,t)"), equalTo(true));
    }

    @Test
    void parseBoolExpr3() {
        assertThat(new Solution().parseBoolExpr("&(t,f)"), equalTo(false));
    }
}
