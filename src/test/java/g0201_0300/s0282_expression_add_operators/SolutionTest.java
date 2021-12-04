package g0201_0300.s0282_expression_add_operators;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void addOperators() {
        assertThat(new Solution().addOperators("123", 6), equalTo(Arrays.asList("1+2+3", "1*2*3")));
    }
}
