package g3301_3400.s3349_adjacent_increasing_subarrays_detection_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasIncreasingSubarrays() {
        assertThat(
                new Solution().hasIncreasingSubarrays(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3),
                equalTo(true));
    }

    @Test
    void hasIncreasingSubarrays2() {
        assertThat(
                new Solution().hasIncreasingSubarrays(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 5),
                equalTo(false));
    }
}
