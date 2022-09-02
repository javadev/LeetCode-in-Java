package g0101_0200.s0179_largest_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestNumber() {
        assertThat(new Solution().largestNumber(new int[] {10, 2}), equalTo("210"));
    }

    @Test
    void largestNumber2() {
        assertThat(new Solution().largestNumber(new int[] {3, 30, 34, 5, 9}), equalTo("9534330"));
    }
}
