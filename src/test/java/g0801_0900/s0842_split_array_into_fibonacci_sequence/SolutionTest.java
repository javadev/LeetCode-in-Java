package g0801_0900.s0842_split_array_into_fibonacci_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitIntoFibonacci() {
        assertThat(
                new Solution().splitIntoFibonacci("1101111"),
                equalTo(Arrays.asList(11, 0, 11, 11)));
    }

    @Test
    void splitIntoFibonacci2() {
        assertThat(
                new Solution().splitIntoFibonacci("112358130"), equalTo(Collections.emptyList()));
    }

    @Test
    void splitIntoFibonacci3() {
        assertThat(new Solution().splitIntoFibonacci("0123"), equalTo(Collections.emptyList()));
    }
}
