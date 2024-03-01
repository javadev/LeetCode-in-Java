package g2601_2700.s2681_power_of_heroes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfPower() {
        assertThat(new Solution().sumOfPower(new int[] {2, 1, 4}), equalTo(141));
    }

    @Test
    void sumOfPower2() {
        assertThat(new Solution().sumOfPower(new int[] {1, 1, 1}), equalTo(7));
    }
}
