package g3601_3700.s3628_maximum_number_of_subsequences_after_one_inserting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfSubsequences() {
        assertThat(new Solution().numOfSubsequences("LMCT"), equalTo(2L));
    }

    @Test
    void numOfSubsequences2() {
        assertThat(new Solution().numOfSubsequences("LCCT"), equalTo(4L));
    }

    @Test
    void numOfSubsequences3() {
        assertThat(new Solution().numOfSubsequences("L"), equalTo(0L));
    }
}
