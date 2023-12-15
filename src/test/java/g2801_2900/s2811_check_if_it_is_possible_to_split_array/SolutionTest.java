package g2801_2900.s2811_check_if_it_is_possible_to_split_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canSplitArray() {
        assertThat(new Solution().canSplitArray(Arrays.asList(2, 2, 1), 4), equalTo(true));
    }

    @Test
    void canSplitArray2() {
        assertThat(new Solution().canSplitArray(Arrays.asList(2, 1, 3), 5), equalTo(false));
    }

    @Test
    void canSplitArray3() {
        assertThat(new Solution().canSplitArray(Arrays.asList(2, 3, 3, 2, 3), 6), equalTo(true));
    }

    @Test
    void canSplitArray4() {
        assertThat(new Solution().canSplitArray(Arrays.asList(1), 1), equalTo(true));
    }
}
