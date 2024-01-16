package g2701_2800.s2786_visit_array_positions_to_maximize_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        int[] nums1 = {2, 3, 6, 1, 9, 2};
        int x1 = 5;
        assertThat(new Solution().maxScore(nums1, x1), equalTo(13L));
    }

    @Test
    void maxScore2() {
        int[] nums2 = {2, 4, 6, 8};
        int x2 = 3;
        assertThat(new Solution().maxScore(nums2, x2), equalTo(20L));
    }
}
