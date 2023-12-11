package g0201_0300.s0282_expression_add_operators;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addOperators() {
        assertThat(new Solution().addOperators("123", 6), equalTo(Arrays.asList("1+2+3", "1*2*3")));
    }

    @Test
    void addOperators2() {
        assertThat(new Solution().addOperators("232", 8), equalTo(Arrays.asList("2+3*2", "2*3+2")));
    }

    @Test
    void addOperators3() {
        assertThat(
                new Solution().addOperators("3456237490", 9191), equalTo(Collections.emptyList()));
    }
}
