package g2501_2600.s2528_maximize_the_minimum_powered_city;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPower() {
        assertThat(new Solution().maxPower(new int[] {1, 2, 4, 5, 0}, 1, 2), equalTo(5L));
    }

    @Test
    void maxPower2() {
        assertThat(new Solution().maxPower(new int[] {4, 4, 4, 4}, 0, 3), equalTo(4L));
    }
}
