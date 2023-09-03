package g1001_1100.s1018_binary_prefix_divisible_by_5;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void prefixesDivBy5() {
        assertThat(
                new Solution().prefixesDivBy5(new int[] {0, 1, 1}),
                equalTo(Arrays.asList(true, false, false)));
    }

    @Test
    void prefixesDivBy52() {
        assertThat(
                new Solution().prefixesDivBy5(new int[] {1, 1, 1}),
                equalTo(Arrays.asList(false, false, false)));
    }
}
