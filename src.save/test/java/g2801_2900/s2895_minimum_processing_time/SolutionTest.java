package g2801_2900.s2895_minimum_processing_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minProcessingTime() {
        assertThat(
                new Solution()
                        .minProcessingTime(
                                Arrays.asList(8, 10), Arrays.asList(2, 2, 3, 1, 8, 7, 4, 5)),
                equalTo(16));
    }

    @Test
    void minProcessingTime2() {
        assertThat(
                new Solution()
                        .minProcessingTime(
                                Arrays.asList(10, 20), Arrays.asList(2, 3, 1, 2, 5, 8, 4, 3)),
                equalTo(23));
    }
}
