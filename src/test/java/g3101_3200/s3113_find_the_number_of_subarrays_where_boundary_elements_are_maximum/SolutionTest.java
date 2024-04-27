package g3101_3200.s3113_find_the_number_of_subarrays_where_boundary_elements_are_maximum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSubarrays() {
        assertThat(new Solution().numberOfSubarrays(new int[] {1, 4, 3, 3, 2}), equalTo(6L));
    }

    @Test
    void numberOfSubarrays2() {
        assertThat(new Solution().numberOfSubarrays(new int[] {3, 3, 3}), equalTo(6L));
    }

    @Test
    void numberOfSubarrays3() {
        assertThat(new Solution().numberOfSubarrays(new int[] {1}), equalTo(1L));
    }
}
