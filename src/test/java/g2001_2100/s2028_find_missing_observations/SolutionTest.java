package g2001_2100.s2028_find_missing_observations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void missingRolls() {
        assertThat(
                new Solution().missingRolls(new int[] {3, 2, 4, 3}, 4, 2),
                equalTo(new int[] {6, 6}));
    }

    @Test
    void missingRolls2() {
        assertThat(
                new Solution().missingRolls(new int[] {1, 5, 6}, 3, 4),
                equalTo(new int[] {6, 1, 1, 1}));
    }

    @Test
    void missingRolls3() {
        assertThat(
                new Solution().missingRolls(new int[] {1, 2, 3, 4}, 6, 4), equalTo(new int[] {}));
    }
}
