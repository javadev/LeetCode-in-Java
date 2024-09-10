package g3201_3300.s3282_reach_end_of_array_with_max_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaximumScore() {
        assertThat(new Solution().findMaximumScore(List.of(1, 3, 1, 5)), equalTo(7L));
    }

    @Test
    void findMaximumScore2() {
        assertThat(new Solution().findMaximumScore(List.of(4, 3, 1, 3, 2)), equalTo(16L));
    }
}
