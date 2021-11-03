package s0089_gray_code;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void grayCode() {
        assertThat(new Solution().grayCode(2).toArray(), equalTo(new int[] {0, 1, 3, 2}));
    }
}
