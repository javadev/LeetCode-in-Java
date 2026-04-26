package g3701_3800.s3740_minimum_distance_between_three_equal_elements_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDistance() {
        assertThat(new Solution().minimumDistance(new int[] {1, 1, 1}), equalTo(4));
    }

    @Test
    void minimumDistance2() {
        assertThat(new Solution().minimumDistance(new int[] {1, 2, 3, 1, 2, 3}), equalTo(-1));
    }

    @Test
    void minimumDistance3() {
        assertThat(new Solution().minimumDistance(new int[] {1, 2, 1, 2, 1}), equalTo(8));
    }
}
