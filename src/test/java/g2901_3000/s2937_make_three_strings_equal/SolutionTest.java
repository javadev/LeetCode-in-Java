package g2901_3000.s2937_make_three_strings_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMinimumOperations() {
        assertThat(new Solution().findMinimumOperations("abc", "abb", "ab"), equalTo(2));
    }

    @Test
    void findMinimumOperations2() {
        assertThat(new Solution().findMinimumOperations("dac", "bac", "cac"), equalTo(-1));
    }
}
