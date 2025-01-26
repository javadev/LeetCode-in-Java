package g3401_3500.s3434_maximum_frequency_after_subarray_operation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFrequency() {
        assertThat(new Solution().maxFrequency(new int[] {1, 2, 3, 4, 5, 6}, 1), equalTo(2));
    }

    @Test
    void maxFrequency2() {
        assertThat(
                new Solution().maxFrequency(new int[] {10, 2, 3, 4, 5, 5, 4, 3, 2, 2}, 10),
                equalTo(4));
    }
}
