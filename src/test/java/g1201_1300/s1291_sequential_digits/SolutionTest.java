package g1201_1300.s1291_sequential_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sequentialDigits() {
        assertThat(new Solution().sequentialDigits(100, 300), equalTo(Arrays.asList(123, 234)));
    }

    @Test
    void sequentialDigits2() {
        assertThat(
                new Solution().sequentialDigits(1000, 13000),
                equalTo(Arrays.asList(1234, 2345, 3456, 4567, 5678, 6789, 12345)));
    }
}
