package g0901_1000.s0942_di_string_match;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void diStringMatch() {
        assertThat(
                CommonUtils.compareArray(
                        new Solution().diStringMatch("IDID"), new int[] {0, 4, 1, 3, 2}),
                equalTo(true));
    }

    @Test
    void diStringMatch2() {
        assertThat(new Solution().diStringMatch("III"), equalTo(new int[] {0, 1, 2, 3}));
    }

    @Test
    void diStringMatch3() {
        assertThat(new Solution().diStringMatch("DDI"), equalTo(new int[] {3, 2, 0, 1}));
    }
}
