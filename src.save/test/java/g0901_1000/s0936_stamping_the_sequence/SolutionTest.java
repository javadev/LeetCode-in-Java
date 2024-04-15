package g0901_1000.s0936_stamping_the_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void movesToStamp() {
        assertThat(
                CommonUtils.compareArray(
                        new Solution().movesToStamp("abc", "ababc"), new int[] {0, 2}),
                equalTo(true));
    }

    @Test
    void movesToStamp2() {
        assertThat(
                CommonUtils.compareArray(
                        new Solution().movesToStamp("abca", "aabcaca"), new int[] {3, 0, 1}),
                equalTo(true));
    }
}
