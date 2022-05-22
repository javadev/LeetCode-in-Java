package g1901_2000.s1903_largest_odd_number_in_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestOddNumber() {
        assertThat(new Solution().largestOddNumber("52"), equalTo("5"));
    }

    @Test
    void largestOddNumber2() {
        assertThat(new Solution().largestOddNumber("4206"), equalTo(""));
    }

    @Test
    void largestOddNumber3() {
        assertThat(new Solution().largestOddNumber("35427"), equalTo("35427"));
    }
}
