package g1401_1500.s1404_number_of_steps_to_reduce_a_number_in_binary_representation_to_one;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSteps() {
        assertThat(new Solution().numSteps("1101"), equalTo(6));
    }

    @Test
    void numSteps2() {
        assertThat(new Solution().numSteps("10"), equalTo(1));
    }

    @Test
    void numSteps3() {
        assertThat(new Solution().numSteps("1"), equalTo(0));
    }
}
