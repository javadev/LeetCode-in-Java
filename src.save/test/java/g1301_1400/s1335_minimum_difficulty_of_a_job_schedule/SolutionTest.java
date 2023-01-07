package g1301_1400.s1335_minimum_difficulty_of_a_job_schedule;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDifficulty() {
        assertThat(new Solution().minDifficulty(new int[] {6, 5, 4, 3, 2, 1}, 2), equalTo(7));
    }

    @Test
    void minDifficulty2() {
        assertThat(new Solution().minDifficulty(new int[] {9, 9, 9}, 4), equalTo(-1));
    }

    @Test
    void minDifficulty3() {
        assertThat(new Solution().minDifficulty(new int[] {1, 1, 1}, 3), equalTo(3));
    }
}
