package g3801_3900.s3848_check_digitorial_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isDigitorialPermutation() {
        assertThat(new Solution().isDigitorialPermutation(145), equalTo(true));
    }

    @Test
    void isDigitorialPermutation2() {
        assertThat(new Solution().isDigitorialPermutation(10), equalTo(false));
    }
}
