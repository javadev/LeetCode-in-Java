package g2501_2600.s2501_longest_square_streak_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSquareStreak() {
        assertThat(new Solution().longestSquareStreak(new int[] {4, 3, 6, 16, 8, 2}), equalTo(3));
    }

    @Test
    void longestSquareStreak2() {
        assertThat(new Solution().longestSquareStreak(new int[] {2, 3, 5, 6, 7}), equalTo(-1));
    }
}
