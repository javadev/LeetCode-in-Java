package g1301_1400.s1343_number_of_sub_arrays_of_size_k_and_average_greater_than_or_equal_to_threshold;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfSubarrays() {
        assertThat(
                new Solution().numOfSubarrays(new int[] {2, 2, 2, 2, 5, 5, 5, 8}, 3, 4),
                equalTo(3));
    }

    @Test
    void numOfSubarrays2() {
        assertThat(
                new Solution().numOfSubarrays(new int[] {11, 13, 17, 23, 29, 31, 7, 5, 2, 3}, 3, 5),
                equalTo(6));
    }
}
