package g0201_0300.s0217_contains_duplicate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void containsDuplicate() {
        assertThat(new Solution().containsDuplicate(new int[] {1, 2, 3, 1}), equalTo(true));
    }
}
