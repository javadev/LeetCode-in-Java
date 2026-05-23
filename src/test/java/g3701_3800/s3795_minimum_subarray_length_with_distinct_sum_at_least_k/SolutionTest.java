package g3701_3800.s3795_minimum_subarray_length_with_distinct_sum_at_least_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minLength() {
        assertThat(new Solution().minLength(new int[] {2, 2, 3, 1}, 4), equalTo(2));
    }

    @Test
    void minLength2() {
        assertThat(new Solution().minLength(new int[] {3, 2, 3, 4}, 5), equalTo(2));
    }

    @Test
    void minLength3() {
        assertThat(new Solution().minLength(new int[] {5, 5, 4}, 5), equalTo(1));
    }
}
