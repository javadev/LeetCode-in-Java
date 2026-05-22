package g3701_3800.s3790_smallest_all_ones_multiple;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAllOneMultiple() {
        assertThat(new Solution().minAllOneMultiple(3), equalTo(3));
    }

    @Test
    void minAllOneMultiple2() {
        assertThat(new Solution().minAllOneMultiple(7), equalTo(6));
    }

    @Test
    void minAllOneMultiple3() {
        assertThat(new Solution().minAllOneMultiple(2), equalTo(-1));
    }
}
