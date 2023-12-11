package g2201_2300.s2281_sum_of_total_strength_of_wizards;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalStrength() {
        assertThat(new Solution().totalStrength(new int[] {1, 3, 1, 2}), equalTo(44));
    }

    @Test
    void totalStrength2() {
        assertThat(new Solution().totalStrength(new int[] {5, 4, 6}), equalTo(213));
    }
}
