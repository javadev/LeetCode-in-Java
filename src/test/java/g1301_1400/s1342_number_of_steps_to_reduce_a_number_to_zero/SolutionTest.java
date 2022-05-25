package g1301_1400.s1342_number_of_steps_to_reduce_a_number_to_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSteps() {
        assertThat(new Solution().numberOfSteps(14), equalTo(6));
    }

    @Test
    void numberOfSteps2() {
        assertThat(new Solution().numberOfSteps(8), equalTo(4));
    }
}
