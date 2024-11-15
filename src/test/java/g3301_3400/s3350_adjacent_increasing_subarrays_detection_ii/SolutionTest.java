package g3301_3400.s3350_adjacent_increasing_subarrays_detection_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxIncreasingSubarrays() {
        assertThat(
                new Solution().maxIncreasingSubarrays(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1)),
                equalTo(3));
    }

    @Test
    void maxIncreasingSubarrays2() {
        assertThat(
                new Solution().maxIncreasingSubarrays(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7)),
                equalTo(2));
    }
}
