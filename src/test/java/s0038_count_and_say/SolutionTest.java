package s0038_count_and_say;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void countAndSay() {
        Solution solution = new Solution();
        assertThat(solution.countAndSay(1), equalTo("1"));
        assertThat(solution.countAndSay(2), equalTo("11"));
        assertThat(solution.countAndSay(3), equalTo("21"));
        assertThat(solution.countAndSay(4), equalTo("1211"));
    }
}
