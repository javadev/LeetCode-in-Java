package g0601_0700.s0636_exclusive_time_of_functions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void exclusiveTime() {
        assertThat(
                new Solution()
                        .exclusiveTime(
                                2, Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6")),
                equalTo(new int[] {3, 4}));
    }

    @Test
    void exclusiveTime2() {
        assertThat(
                new Solution()
                        .exclusiveTime(
                                1,
                                Arrays.asList(
                                        "0:start:0",
                                        "0:start:2",
                                        "0:end:5",
                                        "0:start:6",
                                        "0:end:6",
                                        "0:end:7")),
                equalTo(new int[] {8}));
    }

    @Test
    void exclusiveTime3() {
        assertThat(
                new Solution()
                        .exclusiveTime(
                                2,
                                Arrays.asList(
                                        "0:start:0",
                                        "0:start:2",
                                        "0:end:5",
                                        "1:start:6",
                                        "1:end:6",
                                        "0:end:7")),
                equalTo(new int[] {7, 1}));
    }
}
