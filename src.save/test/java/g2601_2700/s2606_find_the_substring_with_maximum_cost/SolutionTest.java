package g2601_2700.s2606_find_the_substring_with_maximum_cost;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumCostSubstring() {
        assertThat(new Solution().maximumCostSubstring("adaa", "d", new int[] {-1000}), equalTo(2));
    }

    @Test
    void maximumCostSubstring2() {
        assertThat(
                new Solution().maximumCostSubstring("abc", "abc", new int[] {-1, -1, -1}),
                equalTo(0));
    }
}
