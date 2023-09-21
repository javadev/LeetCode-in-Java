package g2701_2800.s2769_find_the_maximum_achievable_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void theMaximumAchievableX() {
        assertThat(new Solution().theMaximumAchievableX(4, 1), equalTo(6));
    }

    @Test
    void theMaximumAchievableX2() {
        assertThat(new Solution().theMaximumAchievableX(3, 2), equalTo(7));
    }
}
