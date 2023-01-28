package g2001_2100.s2044_count_number_of_maximum_bitwise_or_subsets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countMaxOrSubsets() {
        assertThat(new Solution().countMaxOrSubsets(new int[] {3, 1}), equalTo(2));
    }

    @Test
    void countMaxOrSubsets2() {
        assertThat(new Solution().countMaxOrSubsets(new int[] {2, 2, 2}), equalTo(7));
    }

    @Test
    void countMaxOrSubsets3() {
        assertThat(new Solution().countMaxOrSubsets(new int[] {3, 2, 1, 5}), equalTo(6));
    }
}
