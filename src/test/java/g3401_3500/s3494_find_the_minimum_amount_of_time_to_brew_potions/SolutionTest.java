package g3401_3500.s3494_find_the_minimum_amount_of_time_to_brew_potions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTime() {
        assertThat(
                new Solution().minTime(new int[] {1, 5, 2, 4}, new int[] {5, 1, 4, 2}),
                equalTo(110L));
    }

    @Test
    void minTime2() {
        assertThat(new Solution().minTime(new int[] {1, 1, 1}, new int[] {1, 1, 1}), equalTo(5L));
    }

    @Test
    void minTime3() {
        assertThat(new Solution().minTime(new int[] {1, 2, 3, 4}, new int[] {1, 2}), equalTo(21L));
    }
}
