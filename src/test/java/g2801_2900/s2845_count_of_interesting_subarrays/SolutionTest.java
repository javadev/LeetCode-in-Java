package g2801_2900.s2845_count_of_interesting_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countInterestingSubarrays() {
        assertThat(
                new Solution().countInterestingSubarrays(Arrays.asList(3, 2, 4), 2, 1),
                equalTo(3L));
    }

    @Test
    void countInterestingSubarrays2() {
        assertThat(
                new Solution().countInterestingSubarrays(Arrays.asList(3, 1, 9, 6), 3, 0),
                equalTo(2L));
    }
}
