package g2601_2700.s2644_find_the_maximum_divisibility_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDivScore() {
        assertThat(
                new Solution().maxDivScore(new int[] {4, 7, 9, 3, 9}, new int[] {5, 2, 3}),
                equalTo(3));
    }

    @Test
    void maxDivScore2() {
        assertThat(
                new Solution().maxDivScore(new int[] {20, 14, 21, 10}, new int[] {5, 7, 5}),
                equalTo(5));
    }

    @Test
    void maxDivScore3() {
        assertThat(new Solution().maxDivScore(new int[] {12}, new int[] {10}), equalTo(10));
    }
}
