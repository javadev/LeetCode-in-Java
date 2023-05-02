package g1201_1300.s1248_count_number_of_nice_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSubarrays() {
        assertThat(new Solution().numberOfSubarrays(new int[] {1, 1, 2, 1, 1}, 3), equalTo(2));
    }

    @Test
    void numberOfSubarrays2() {
        assertThat(new Solution().numberOfSubarrays(new int[] {2, 4, 6}, 1), equalTo(0));
    }

    @Test
    void numberOfSubarrays3() {
        assertThat(
                new Solution().numberOfSubarrays(new int[] {2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2),
                equalTo(16));
    }
}
