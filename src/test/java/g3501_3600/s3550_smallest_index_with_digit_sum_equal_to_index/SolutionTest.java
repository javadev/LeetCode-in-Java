package g3501_3600.s3550_smallest_index_with_digit_sum_equal_to_index;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestIndex() {
        assertThat(new Solution().smallestIndex(new int[] {1, 3, 2}), equalTo(2));
    }

    @Test
    void smallestIndex2() {
        assertThat(new Solution().smallestIndex(new int[] {1, 10, 11}), equalTo(1));
    }

    @Test
    void smallestIndex3() {
        assertThat(new Solution().smallestIndex(new int[] {1, 2, 3}), equalTo(-1));
    }
}
