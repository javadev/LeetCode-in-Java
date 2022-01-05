package g0501_0600.s0539_minimum_time_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMinDifference() {
        assertThat(new Solution().findMinDifference(Arrays.asList("23:59", "00:00")), equalTo(1));
    }

    @Test
    void findMinDifference2() {
        assertThat(
                new Solution().findMinDifference(Arrays.asList("00:00", "23:59", "00:00")),
                equalTo(0));
    }

    @Test
    void findMinDifference3() {
        List<String> timePoints = new ArrayList<>();
        IntStream.rangeClosed(0, 310 / 2)
                .forEach(
                        index -> {
                            timePoints.add("23:59");
                            timePoints.add("00:00");
                        });
        assertThat(new Solution().findMinDifference(timePoints), equalTo(0));
    }
}
