package g2801_2900.s2865_beautiful_towers_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSumOfHeights() {
        assertThat(new Solution().maximumSumOfHeights(Arrays.asList(5, 3, 4, 1, 1)), equalTo(13L));
    }

    @Test
    void maximumSumOfHeights2() {
        assertThat(
                new Solution().maximumSumOfHeights(Arrays.asList(6, 5, 3, 9, 2, 7)), equalTo(22L));
    }

    @Test
    void maximumSumOfHeights3() {
        assertThat(
                new Solution().maximumSumOfHeights(Arrays.asList(3, 2, 5, 5, 2, 3)), equalTo(18L));
    }
}
