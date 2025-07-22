package g3601_3700.s3621_number_of_integers_with_popcount_depth_equal_to_k_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void popcountDepth() {
        assertThat(new Solution().popcountDepth(4L, 1), equalTo(2L));
    }

    @Test
    void popcountDepth2() {
        assertThat(new Solution().popcountDepth(7L, 2), equalTo(3L));
    }
}
