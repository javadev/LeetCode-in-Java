package g3101_3200.s3197_find_the_minimum_area_to_cover_all_ones_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSum() {
        assertThat(new Solution().minimumSum(new int[][] {{1, 0, 1}, {1, 1, 1}}), equalTo(5));
    }

    @Test
    void minimumSum2() {
        assertThat(new Solution().minimumSum(new int[][] {{1, 0, 1, 0}, {0, 1, 0, 1}}), equalTo(5));
    }
}
