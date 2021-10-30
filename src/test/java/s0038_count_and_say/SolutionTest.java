package s0038_count_and_say;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void countAndSay() {
        assertThat(new Solution().countAndSay(1), equalTo("1"));
    }
}
