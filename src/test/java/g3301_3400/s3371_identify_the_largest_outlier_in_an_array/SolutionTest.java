package g3301_3400.s3371_identify_the_largest_outlier_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getLargestOutlier() {
        assertThat(new Solution().getLargestOutlier(new int[] {2, 3, 5, 10}), equalTo(10));
    }

    @Test
    void getLargestOutlier2() {
        assertThat(new Solution().getLargestOutlier(new int[] {-2, -1, -3, -6, 4}), equalTo(4));
    }

    @Test
    void getLargestOutlier3() {
        assertThat(new Solution().getLargestOutlier(new int[] {1, 1, 1, 1, 1, 5, 5}), equalTo(5));
    }

    @Test
    void getLargestOutlier4() {
        assertThat(new Solution().getLargestOutlier(new int[] {-108, -108, -517}), equalTo(-517));
    }
}
