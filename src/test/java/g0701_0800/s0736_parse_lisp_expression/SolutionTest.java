package g0701_0800.s0736_parse_lisp_expression;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void evaluate() {
        assertThat(
                new Solution().evaluate("(let x 2 (mult x (let x 3 y 4 (add x y))))"), equalTo(14));
    }

    @Test
    void evaluate2() {
        assertThat(new Solution().evaluate("(let x 3 x 2 x)"), equalTo(2));
    }

    @Test
    void evaluate3() {
        assertThat(new Solution().evaluate("(let x 1 y 2 x (add x y) (add x y))"), equalTo(5));
    }
}
