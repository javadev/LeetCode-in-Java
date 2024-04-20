package g2401_2500.s2481_minimum_cuts_to_divide_a_circle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfCuts() {
        assertThat(new Solution().numberOfCuts(4), equalTo(2));
    }

    @Test
    void numberOfCuts2() {
        assertThat(new Solution().numberOfCuts(3), equalTo(3));
    }
}
