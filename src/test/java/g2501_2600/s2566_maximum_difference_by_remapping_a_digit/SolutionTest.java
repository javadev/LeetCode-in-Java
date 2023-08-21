package g2501_2600.s2566_maximum_difference_by_remapping_a_digit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMaxDifference() {
        assertThat(new Solution().minMaxDifference(11891), equalTo(99009));
    }

    @Test
    void minMaxDifference2() {
        assertThat(new Solution().minMaxDifference(90), equalTo(99));
    }
}
