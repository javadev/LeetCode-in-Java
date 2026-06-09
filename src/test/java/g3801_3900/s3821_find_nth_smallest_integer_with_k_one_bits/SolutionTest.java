package g3801_3900.s3821_find_nth_smallest_integer_with_k_one_bits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nthSmallest() {
        assertThat(new Solution().nthSmallest(4, 2), equalTo(9L));
    }

    @Test
    void nthSmallest2() {
        assertThat(new Solution().nthSmallest(3, 1), equalTo(4L));
    }
}
