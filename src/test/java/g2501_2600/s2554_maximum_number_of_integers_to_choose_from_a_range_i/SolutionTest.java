package g2501_2600.s2554_maximum_number_of_integers_to_choose_from_a_range_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxCount() {
        assertThat(new Solution().maxCount(new int[] {1, 6, 5}, 5, 6), equalTo(2));
    }

    @Test
    void maxCount2() {
        assertThat(new Solution().maxCount(new int[] {1, 2, 3, 4, 5, 6, 7}, 8, 1), equalTo(0));
    }

    @Test
    void maxCount3() {
        assertThat(new Solution().maxCount(new int[] {11}, 7, 50), equalTo(7));
    }
}
