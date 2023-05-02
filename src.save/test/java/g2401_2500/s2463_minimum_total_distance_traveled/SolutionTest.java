package g2401_2500.s2463_minimum_total_distance_traveled;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTotalDistance() {
        assertThat(
                new Solution()
                        .minimumTotalDistance(Arrays.asList(0, 4, 6), new int[][] {{2, 2}, {6, 2}}),
                equalTo(4L));
    }

    @Test
    void minimumTotalDistance2() {
        assertThat(
                new Solution()
                        .minimumTotalDistance(Arrays.asList(1, -1), new int[][] {{-2, 1}, {2, 1}}),
                equalTo(2L));
    }
}
