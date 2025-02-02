package g3401_3500.s3445_maximum_difference_between_even_and_odd_frequency_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDifference() {
        assertThat(new Solution().maxDifference("12233", 4), equalTo(-1));
    }

    @Test
    void maxDifference2() {
        assertThat(new Solution().maxDifference("1122211", 3), equalTo(1));
    }

    @Test
    void maxDifference3() {
        assertThat(new Solution().maxDifference("110", 3), equalTo(-1));
    }
}
