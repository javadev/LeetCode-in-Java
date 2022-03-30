package g0801_0900.s0831_masking_personal_information;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maskPII() {
        assertThat(
                new Solution().maskPII("LeetCode@LeetCode.com"), equalTo("l*****e@leetcode.com"));
    }

    @Test
    void maskPII2() {
        assertThat(new Solution().maskPII("AB@qq.com"), equalTo("a*****b@qq.com"));
    }

    @Test
    void maskPII3() {
        assertThat(new Solution().maskPII("1(234)567-890"), equalTo("***-***-7890"));
    }
}
