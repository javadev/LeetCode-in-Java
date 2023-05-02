package g2301_2400.s2383_minimum_hours_of_training_to_win_a_competition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minNumberOfHours() {
        assertThat(
                new Solution()
                        .minNumberOfHours(5, 3, new int[] {1, 4, 3, 2}, new int[] {2, 6, 3, 1}),
                equalTo(8));
    }

    @Test
    void minNumberOfHours2() {
        assertThat(new Solution().minNumberOfHours(2, 4, new int[] {1}, new int[] {3}), equalTo(0));
    }
}
