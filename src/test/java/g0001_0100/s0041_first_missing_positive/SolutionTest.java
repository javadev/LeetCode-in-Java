package g0001_0100.s0041_first_missing_positive;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void firstMissingPositive() {
        assertThat(new Solution().firstMissingPositive(new int[] {1, 2, 0}), equalTo(3));
    }
}
