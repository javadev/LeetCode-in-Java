package g2801_2900.s2817_minimum_absolute_difference_between_elements_with_constraint;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAbsoluteDifference() {
        assertThat(new Solution().minAbsoluteDifference(Arrays.asList(4, 3, 2, 4), 2), equalTo(0));
    }

    @Test
    void minAbsoluteDifference2() {
        assertThat(
                new Solution().minAbsoluteDifference(Arrays.asList(5, 3, 2, 10, 15), 1),
                equalTo(1));
    }

    @Test
    void minAbsoluteDifference3() {
        assertThat(new Solution().minAbsoluteDifference(Arrays.asList(1, 2, 3, 4), 3), equalTo(3));
    }
}
