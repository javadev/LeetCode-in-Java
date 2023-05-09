package g0301_0400.s0315_count_of_smaller_numbers_after_self;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSmaller() {
        assertThat(
                new Solution().countSmaller(new int[] {5, 2, 6, 1}),
                equalTo(Arrays.asList(2, 1, 1, 0)));
    }

    @Test
    void countSmaller2() {
        assertThat(new Solution().countSmaller(new int[] {-1}), equalTo(Arrays.asList(0)));
    }

    @Test
    void countSmaller3() {
        assertThat(new Solution().countSmaller(new int[] {-1, -1}), equalTo(Arrays.asList(0, 0)));
    }
}
