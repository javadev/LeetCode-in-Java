package g0401_0500.s0401_binary_watch;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void readBinaryWatch() {
        assertThat(
                new Solution().readBinaryWatch(1),
                equalTo(
                        Arrays.asList(
                                "0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00",
                                "4:00", "8:00")));
    }

    @Test
    void readBinaryWatch2() {
        assertThat(new Solution().readBinaryWatch(9), equalTo(Arrays.asList()));
    }
}
