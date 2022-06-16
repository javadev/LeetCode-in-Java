package g2201_2300.s2275_largest_combination_with_bitwise_and_greater_than_zero;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void largestCombination() {
        assertThat(new Solution().largestCombination(new int[]{16,17,71,62,12,24,14}), equalTo(4));
    }

    @Test
    void largestCombination2() {
        assertThat(new Solution().largestCombination(new int[]{8,8}), equalTo(2));
    }
}
