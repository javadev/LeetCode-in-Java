package g0101_0200.s0137_single_number_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void singleNumber() {
        assertThat(new Solution().singleNumber(new int[] {2, 2, 3, 2}), equalTo(3));
    }
}
