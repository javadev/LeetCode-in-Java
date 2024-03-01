package g3001_3100.s3036_number_of_subarrays_that_match_a_pattern_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countMatchingSubarrays() {
        assertThat(
                new Solution()
                        .countMatchingSubarrays(new int[] {1, 2, 3, 4, 5, 6}, new int[] {1, 1}),
                equalTo(4));
    }

    @Test
    void countMatchingSubarrays2() {
        assertThat(
                new Solution()
                        .countMatchingSubarrays(
                                new int[] {1, 4, 4, 1, 3, 5, 5, 3}, new int[] {1, 0, -1}),
                equalTo(2));
    }
}
