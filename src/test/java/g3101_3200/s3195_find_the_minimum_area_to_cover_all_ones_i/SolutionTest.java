package g3101_3200.s3195_find_the_minimum_area_to_cover_all_ones_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumArea() {
        assertThat(new Solution().minimumArea(new int[][] {{0, 1, 0}, {1, 0, 1}}), equalTo(6));
    }

    @Test
    void minimumArea2() {
        assertThat(new Solution().minimumArea(new int[][] {{1, 0}, {0, 0}}), equalTo(1));
    }
}
