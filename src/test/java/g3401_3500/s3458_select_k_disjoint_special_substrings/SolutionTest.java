package g3401_3500.s3458_select_k_disjoint_special_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubstringLength() {
        assertThat(new Solution().maxSubstringLength("abcdbaefab", 2), equalTo(true));
    }

    @Test
    void maxSubstringLength2() {
        assertThat(new Solution().maxSubstringLength("cdefdc", 3), equalTo(false));
    }

    @Test
    void maxSubstringLength3() {
        assertThat(new Solution().maxSubstringLength("abeabe", 0), equalTo(true));
    }
}
