package g3401_3500.s3442_maximum_difference_between_even_and_odd_frequency_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDifference() {
        assertThat(new Solution().maxDifference("aaaaabbc"), equalTo(3));
    }

    @Test
    void maxDifference2() {
        assertThat(new Solution().maxDifference("abcabcab"), equalTo(1));
    }
}
