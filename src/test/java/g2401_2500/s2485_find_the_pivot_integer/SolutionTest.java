package g2401_2500.s2485_find_the_pivot_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pivotInteger() {
        assertThat(new Solution().pivotInteger(8), equalTo(6));
    }

    @Test
    void pivotInteger2() {
        assertThat(new Solution().pivotInteger(1), equalTo(1));
    }

    @Test
    void pivotInteger3() {
        assertThat(new Solution().pivotInteger(4), equalTo(-1));
    }
}
