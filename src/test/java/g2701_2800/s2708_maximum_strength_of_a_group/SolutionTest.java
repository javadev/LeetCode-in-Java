package g2701_2800.s2708_maximum_strength_of_a_group;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxStrength() {
        assertThat(new Solution().maxStrength(new int[] {3, -1, -5, 2, 5, -9}), equalTo(1350L));
    }

    @Test
    void maxStrength2() {
        assertThat(new Solution().maxStrength(new int[] {-4, -5, -4}), equalTo(20L));
    }

    @Test
    void maxStrength3() {
        assertThat(
                new Solution().maxStrength(new int[] {8, 6, 0, 5, -4, -8, -4, 9, -1, 6, -4, 8, -5}),
                equalTo(265420800L));
    }
}
