package g0301_0400.s0368_largest_divisible_subset;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestDivisibleSubset() {
        assertThat(
                new Solution().largestDivisibleSubset(new int[] {1, 2, 3}),
                equalTo(new ArrayList<>(Arrays.asList(1, 2))));
    }

    @Test
    void largestDivisibleSubset2() {
        assertThat(
                new Solution().largestDivisibleSubset(new int[] {1, 2, 4, 8}),
                equalTo(new ArrayList<>(Arrays.asList(1, 2, 4, 8))));
    }
}
