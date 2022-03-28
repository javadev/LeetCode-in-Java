package g1401_1500.s1423_maximum_points_you_can_obtain_from_cards;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(new Solution().maxScore(new int[] {1, 2, 3, 4, 5, 6, 1}, 3), equalTo(12));
    }

    @Test
    void maxScore2() {
        assertThat(new Solution().maxScore(new int[] {2, 2, 2}, 2), equalTo(4));
    }

    @Test
    void maxScore3() {
        assertThat(new Solution().maxScore(new int[] {9, 7, 7, 9, 7, 7, 9}, 7), equalTo(55));
    }
}
