package g1301_1400.s1375_number_of_times_binary_string_is_prefix_aligned;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numTimesAllBlue() {
        assertThat(new Solution().numTimesAllBlue(new int[] {3, 2, 4, 1, 5}), equalTo(2));
    }

    @Test
    void numTimesAllBlue2() {
        assertThat(new Solution().numTimesAllBlue(new int[] {4, 1, 2, 3}), equalTo(1));
    }
}
