package g3801_3900.s3847_find_the_score_difference_in_a_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void scoreDifference() {
        assertThat(new Solution().scoreDifference(new int[] {1, 2, 3}), equalTo(0));
    }

    @Test
    void scoreDifference2() {
        assertThat(new Solution().scoreDifference(new int[] {2, 4, 2, 1, 2, 1}), equalTo(4));
    }

    @Test
    void scoreDifference3() {
        assertThat(new Solution().scoreDifference(new int[] {1}), equalTo(-1));
    }
}
