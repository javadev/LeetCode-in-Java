package g2201_2300.s2272_substring_with_largest_variance;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void largestVariance() {
        assertThat(new Solution().largestVariance("aababbb"), equalTo(3));
    }

    @Test
    void largestVariance2() {
        assertThat(new Solution().largestVariance("abcde"), equalTo(0));
    }
}
