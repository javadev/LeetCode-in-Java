package g1301_1400.s1363_largest_multiple_of_three;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestMultipleOfThree() {
        assertThat(new Solution().largestMultipleOfThree(new int[] {8, 1, 9}), equalTo("981"));
    }

    @Test
    void largestMultipleOfThree2() {
        assertThat(
                new Solution().largestMultipleOfThree(new int[] {8, 6, 7, 1, 0}), equalTo("8760"));
    }

    @Test
    void largestMultipleOfThree3() {
        assertThat(new Solution().largestMultipleOfThree(new int[] {1}), equalTo(""));
    }
}
