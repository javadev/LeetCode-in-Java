package g0001_0100.s0066_plus_one;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void plusOne() {
        assertThat(new Solution().plusOne(new int[] {1, 2, 3}), equalTo(new int[] {1, 2, 4}));
    }
}
