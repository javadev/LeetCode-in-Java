package g3001_3100.s3096_minimum_levels_to_gain_more_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumLevels() {
        assertThat(new Solution().minimumLevels(new int[] {1, 0, 1, 0}), equalTo(1));
    }

    @Test
    void minimumLevels2() {
        assertThat(new Solution().minimumLevels(new int[] {1, 1, 1, 1, 1}), equalTo(3));
    }

    @Test
    void minimumLevels3() {
        assertThat(new Solution().minimumLevels(new int[] {0, 0}), equalTo(-1));
    }
}
