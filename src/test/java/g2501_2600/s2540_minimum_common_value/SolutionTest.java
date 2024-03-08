package g2501_2600.s2540_minimum_common_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getCommon() {
        assertThat(new Solution().getCommon(new int[] {1, 2, 3}, new int[] {2, 4}), equalTo(2));
    }

    @Test
    void getCommon2() {
        assertThat(
                new Solution().getCommon(new int[] {1, 2, 3, 6}, new int[] {2, 3, 4, 5}),
                equalTo(2));
    }
}
