package g3901_4000.s3920_maximize_fixed_points_after_deletions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFixedPoints() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 1, 2}), equalTo(2));
    }

    @Test
    void maxFixedPoints2() {
        assertThat(new Solution().maxFixedPoints(new int[] {3, 1, 2}), equalTo(2));
    }

    @Test
    void maxFixedPoints3() {
        assertThat(new Solution().maxFixedPoints(new int[] {1, 0, 1, 2}), equalTo(3));
    }
}
