package g3301_3400.s3395_subsequences_with_a_unique_middle_mode_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subsequencesWithMiddleMode() {
        assertThat(
                new Solution().subsequencesWithMiddleMode(new int[] {1, 1, 1, 1, 1, 1}),
                equalTo(6));
    }

    @Test
    void subsequencesWithMiddleMode2() {
        assertThat(
                new Solution().subsequencesWithMiddleMode(new int[] {1, 2, 2, 3, 3, 4}),
                equalTo(4));
    }

    @Test
    void subsequencesWithMiddleMode3() {
        assertThat(
                new Solution().subsequencesWithMiddleMode(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8}),
                equalTo(0));
    }
}
