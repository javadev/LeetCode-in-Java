package g3801_3900.s3824_minimum_k_to_reduce_array_within_limit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumK() {
        assertThat(new Solution().minimumK(new int[] {3, 7, 5}), equalTo(3));
    }

    @Test
    void minimumK2() {
        assertThat(new Solution().minimumK(new int[] {1}), equalTo(1));
    }
}
