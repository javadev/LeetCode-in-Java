package g1901_2000.s1981_minimize_the_difference_between_target_and_chosen_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizeTheDifference() {
        assertThat(
                new Solution()
                        .minimizeTheDifference(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 13),
                equalTo(0));
    }

    @Test
    void minimizeTheDifference2() {
        assertThat(
                new Solution().minimizeTheDifference(new int[][] {{1}, {2}, {3}}, 100),
                equalTo(94));
    }

    @Test
    void minimizeTheDifference3() {
        assertThat(
                new Solution().minimizeTheDifference(new int[][] {{1, 2, 9, 8, 7}}, 6), equalTo(1));
    }
}
