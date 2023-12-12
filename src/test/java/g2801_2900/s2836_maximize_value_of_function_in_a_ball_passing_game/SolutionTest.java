package g2801_2900.s2836_maximize_value_of_function_in_a_ball_passing_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMaxFunctionValue() {
        assertThat(new Solution().getMaxFunctionValue(Arrays.asList(2, 0, 1), 4), equalTo(6L));
    }

    @Test
    void getMaxFunctionValue2() {
        assertThat(
                new Solution().getMaxFunctionValue(Arrays.asList(1, 1, 1, 2, 3), 3), equalTo(10L));
    }
}
