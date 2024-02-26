package g0901_1000.s0932_beautiful_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautifulArray() {
        int[] result = new Solution().beautifulArray(4);
        int[] expected = new int[] {2, 1, 4, 3};
        assertThat(CommonUtils.compareArray(result, expected), equalTo(true));
    }

    @Test
    void beautifulArray2() {
        int[] result = new Solution().beautifulArray(5);
        int[] expected = new int[] {3, 1, 2, 5, 4};
        assertThat(CommonUtils.compareArray(result, expected), equalTo(true));
    }
}
