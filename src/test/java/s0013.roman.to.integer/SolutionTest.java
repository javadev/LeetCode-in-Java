package s0013.roman.to.integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void romanToInt() {
        assertThat(new Solution().romanToInt("III"), equalTo(3));
    }
}
