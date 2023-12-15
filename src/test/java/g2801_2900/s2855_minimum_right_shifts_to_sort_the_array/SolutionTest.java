package g2801_2900.s2855_minimum_right_shifts_to_sort_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumRightShifts() {
        assertThat(new Solution().minimumRightShifts(Arrays.asList(3, 4, 5, 1, 2)), equalTo(2));
    }

    @Test
    void minimumRightShifts2() {
        assertThat(new Solution().minimumRightShifts(Arrays.asList(1, 3, 5)), equalTo(0));
    }

    @Test
    void minimumRightShifts3() {
        assertThat(new Solution().minimumRightShifts(Arrays.asList(2, 1, 4)), equalTo(-1));
    }
}
