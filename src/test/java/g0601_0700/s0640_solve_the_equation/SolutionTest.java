package g0601_0700.s0640_solve_the_equation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solveEquation() {
        assertThat(new Solution().solveEquation("x+5-3+x=6+x-2"), equalTo("x=2"));
    }

    @Test
    void solveEquation2() {
        assertThat(new Solution().solveEquation("x=x"), equalTo("Infinite solutions"));
    }

    @Test
    void solveEquation3() {
        assertThat(new Solution().solveEquation("2x=x"), equalTo("x=0"));
    }
}
