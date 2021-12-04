package g0001_0100.s0028_implement_strstr;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void strStr() {
        assertThat(new Solution().strStr("hello", "ll"), equalTo(2));
    }
}
