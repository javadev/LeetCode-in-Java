package g3901_4000.s3961_maximize_sum_of_device_ratings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxRatings() {
        assertThat(new Solution().maxRatings(new int[][] {{1, 3}, {2, 2}}), equalTo(4L));
    }

    @Test
    void maxRatings2() {
        assertThat(new Solution().maxRatings(new int[][] {{1, 2, 3}, {4, 5, 6}}), equalTo(6L));
    }

    @Test
    void maxRatings3() {
        assertThat(new Solution().maxRatings(new int[][] {{5, 5, 5}, {1, 1, 1}}), equalTo(6L));
    }

    @Test
    void maxRatings4() {
        assertThat(new Solution().maxRatings(new int[][] {{4}, {7}, {1}}), equalTo(12L));
    }
}
